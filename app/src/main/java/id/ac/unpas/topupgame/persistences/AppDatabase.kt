package id.ac.unpas.topupgame.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.topupgame.model.TopUpGame

@Database(entities = [TopUpGame::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun topUpGameDao(): TopUpGameDao
}