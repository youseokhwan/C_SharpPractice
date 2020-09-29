package com.example.realm

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

//        insertTodo("운동하기")
//        insertTodo("프로젝트 회의")
//        insertTodo("방 청소하기")

//        updateTodo(0, "등 운동하기")

//        deleteTodo(1)
        deleteAllTodo()

        selectAllTodo()
//        selectTodo("운동하기")
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    private fun selectAllTodo() {
        val result = realm.where<Todo>()
                .findAll()
                .sort("id", Sort.ASCENDING)

        Log.d("RealmLog", "===== selectAllTodo() =====")
        for (todo in result) {
            Log.d("RealmLog", "id: ${todo.id}, content: ${todo.content}")
        }
    }

    private fun selectTodo(arg: String) {
        val result = realm.where<Todo>()
                .equalTo("content", arg)
                .findFirst()

        Log.d("RealmLog", "===== selectTodo() =====")
        Log.d("RealmLog", "id: ${result?.id}, content: ${result?.content}")
    }

    private fun getNextId(): Int {
        return realm.where<Todo>().max("id")?.toInt()?.plus(1) ?: 0
    }

    private fun insertTodo(arg: String) {
        realm.beginTransaction()

        val item = realm.createObject<Todo>(getNextId())
        item.content = arg

        realm.commitTransaction()
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

    private fun deleteAllTodo() {
        realm.beginTransaction()

        val item = realm.where<Todo>().findAll()
        item.deleteAllFromRealm()

        realm.commitTransaction()
    }
}