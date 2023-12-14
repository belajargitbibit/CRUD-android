package com.example.crudroomnotes.room

import androidx.room.Entity

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
)

