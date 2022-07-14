package com.chaudharynabin6.databasewithmultipletable.db.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.chaudharynabin6.databasewithmultipletable.db.entities.Student
import com.chaudharynabin6.databasewithmultipletable.db.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,

    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>,
)