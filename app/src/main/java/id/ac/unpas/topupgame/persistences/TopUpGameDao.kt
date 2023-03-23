package id.ac.unpas.topupgame.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.topupgame.model.TopUpGame

@Dao
interface TopUpGameDao {
    @Query("SELECT * FROM TopUpGame")
    fun loadAll(): LiveData<List<TopUpGame>>
    @Query("SELECT * FROM TopUpGame WHERE id = :id")
    fun find(id: String): TopUpGame?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: TopUpGame)
    @Delete
    fun delete(item: TopUpGame)
}