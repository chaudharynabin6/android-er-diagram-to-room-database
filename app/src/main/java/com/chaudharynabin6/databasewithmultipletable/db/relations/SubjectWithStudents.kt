package com.chaudharynabin6.databasewithmultipletable.db.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.chaudharynabin6.databasewithmultipletable.db.entities.Student
import com.chaudharynabin6.databasewithmultipletable.db.entities.Subject

data class SubjectWithStudents(
    @Embedded
    val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val Student : List<Student>
)