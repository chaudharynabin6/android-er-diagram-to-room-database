package com.chaudharynabin6.databasewithmultipletable.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
//    pk
    @PrimaryKey(autoGenerate = false)
    val studentName : String,
    val semester : Int,
//    fk
    val schoolName : String
)