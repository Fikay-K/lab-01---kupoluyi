package com.example.petshop

class Joy (date : String) : Mood(date) {
    override fun mood(){
        println("On $date I felt joyful")
    }
}