package practice.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import practice.calculator.dao.HistoryDao
import practice.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}