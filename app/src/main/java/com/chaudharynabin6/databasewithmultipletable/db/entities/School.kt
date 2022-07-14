package com.chaudharynabin6.databasewithmultipletable.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class School(
//    pk
    @PrimaryKey(autoGenerate = false)
    val schoolName : String
)
