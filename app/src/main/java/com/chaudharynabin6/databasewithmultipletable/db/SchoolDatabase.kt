package com.chaudharynabin6.databasewithmultipletable.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.chaudharynabin6.databasewithmultipletable.db.entities.Director
import com.chaudharynabin6.databasewithmultipletable.db.entities.School
import com.chaudharynabin6.databasewithmultipletable.db.entities.Student
import com.chaudharynabin6.databasewithmultipletable.db.entities.Subject
import com.chaudharynabin6.databasewithmultipletable.db.relations.StudentSubjectCrossRef


@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],
    version = 1,
    exportSchema = true
)
abstract class SchoolDatabase : RoomDatabase() {

    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}