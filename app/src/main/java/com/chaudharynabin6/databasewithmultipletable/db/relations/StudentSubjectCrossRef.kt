package com.chaudharynabin6.databasewithmultipletable.db.relations

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    @ColumnInfo(index = true)
    val studentName : String,
    @ColumnInfo(index = true)
    val subjectName : String
)