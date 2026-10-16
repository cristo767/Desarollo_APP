package picflow.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "albumes")
data class Album(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val descripcion: String,
    val tipo: String,
    val esPrivado: Boolean
)
