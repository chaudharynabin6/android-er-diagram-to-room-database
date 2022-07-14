package com.chaudharynabin6.databasewithmultipletable.db.relations

import androidx.room.Entity

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(
    val studentName : String,
    val subjectName : String
)