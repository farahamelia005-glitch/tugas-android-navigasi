package com.example.belajarstorange

import androidx.room.Entity
import androidx.room.PrimaryKey

// Menandai class ini sebagai tabel SQLite dengan nama 'tabel_catatan'
@Entity(tableName = "tabel_catatan")
data class Catatan(

    // Primary Key dengan autoGenerate = true
    // agar ID terisi otomatis (1, 2, 3, ...)
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val judul: String,
    val isi: String
)