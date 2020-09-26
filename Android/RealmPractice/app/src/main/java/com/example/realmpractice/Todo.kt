package com.example.realmpractice

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Todo(
    @PrimaryKey var id: Int = 0,
    var content: String = ""
) : RealmObject() {

}