package com.example.realmpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.realm.Realm
import io.realm.Sort
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)
        realm = Realm.getDefaultInstance()

        insertTodo("운동")
        insertTodo("프로젝트 회의")
        insertTodo("저녁 선약")

        updateTodo(0, "어깨 운동")
        deleteTodo(1)

        selectTodo()
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    private fun selectTodo() {
        val result = realm.where<Todo>()
            .findAll()
            .sort("id", Sort.ASCENDING)

        for (todo in result) {
            Log.d("RealmLog", "id: ${todo.id}, content: ${todo.content}")
        }
    }

    private fun insertTodo(content: String) {
        realm.beginTransaction()

        val item = realm.createObject<Todo>(getNextId())
        item.content = content

        realm.commitTransaction()
    }

    private fun getNextId(): Int {
        return realm.where<Todo>().max("id")?.toInt()?.plus(1) ?: 0
    }

    private fun updateTodo(id: Int, content: String) {
        realm.beginTransaction()

        val item = realm.where<Todo>().equalTo("id", id).findFirst()
            ?: throw Exception()
        item.content = content

        realm.commitTransaction()
    }

    private fun deleteTodo(id: Int) {
        realm.beginTransaction()

        val item = realm.where<Todo>().equalTo("id", id).findFirst()
            ?: throw Exception()
        item.deleteFromRealm()

        realm.commitTransaction()
    }
}