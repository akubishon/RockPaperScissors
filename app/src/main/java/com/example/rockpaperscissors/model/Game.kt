package com.example.rockpaperscissors.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.rockpaperscissors.R
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "gameTable")
data class Game (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null,

    @ColumnInfo(name = "date")
    var date: Date,

    @ColumnInfo(name = "computer")
    var computer: Int,

    @ColumnInfo(name = "player")
    var player: Int,

    @ColumnInfo(name = "result")
    var result: Int

) : Parcelable {
    companion object {
        val GAME_RES_DRAWABLES_IDS = arrayOf(R.drawable.rock, R.drawable.paper, R.drawable.scissors)
    }
}