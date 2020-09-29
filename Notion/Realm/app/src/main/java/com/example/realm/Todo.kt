package com.example.realm

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Todo(
    @PrimaryKey var id: Int = 0,
    var content: String = ""
) : RealmObject()