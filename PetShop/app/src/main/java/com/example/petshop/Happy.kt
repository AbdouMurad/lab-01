package com.example.petshop

class Happy(date: String) : Mood(date) {
    override fun mood() : String {
        return "on this date $date I'm Happy"
    }
}