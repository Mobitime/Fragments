package com.example.fragments

data class Note(
    val id: Int,
    val text: String,
    val timestamp: String,
    var isChecked: Boolean = false
)