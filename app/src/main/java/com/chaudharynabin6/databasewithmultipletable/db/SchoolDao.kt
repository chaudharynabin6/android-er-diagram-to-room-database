package com.chaudharynabin6.databasewithmultipletable.db

import androidx.room.*
import com.chaudharynabin6.databasewithmultipletable.db.entities.Director
import com.chaudharynabin6.databasewithmultipletable.db.entities.School
import com.chaudharynabin6.databasewithmultipletable.db.relations.SchoolAndDirector

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("select * from school where schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

}