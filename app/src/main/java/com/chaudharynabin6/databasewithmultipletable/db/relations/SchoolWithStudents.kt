package com.chaudharynabin6.databasewithmultipletable.db.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.chaudharynabin6.databasewithmultipletable.db.entities.School
import com.chaudharynabin6.databasewithmultipletable.db.entities.Student

class SchoolWithStudents(
    @Embedded
    val school : School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students : List<Student>
)