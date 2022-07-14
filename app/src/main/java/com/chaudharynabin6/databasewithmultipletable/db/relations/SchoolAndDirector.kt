package com.chaudharynabin6.databasewithmultipletable.db.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.chaudharynabin6.databasewithmultipletable.db.entities.Director
import com.chaudharynabin6.databasewithmultipletable.db.entities.School

class SchoolAndDirector(
//    this is more important
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    var director: Director,
)