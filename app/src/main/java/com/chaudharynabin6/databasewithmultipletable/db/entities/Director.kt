package com.chaudharynabin6.databasewithmultipletable.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director(
//    pk
    @PrimaryKey(autoGenerate = false)
    val directorName : String,
//    fk
    val schoolName : String
)
