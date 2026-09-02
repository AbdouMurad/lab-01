package com.example.petshop

class Sad(date: String) : Mood(date) {
    override fun mood(): String {
        return "on this date $date I'm Sad"
    }
}