package id.ac.unpas.topupgame.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class TopUpGame(
    @PrimaryKey val id: String,
    val tanggal: String,
    val game: String,
    val barang: String,
    val harga: String
)
