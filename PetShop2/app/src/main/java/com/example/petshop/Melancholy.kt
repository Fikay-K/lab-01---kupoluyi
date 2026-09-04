package com.example.petshop

class Melancholy (date : String) : Mood(date) {
    override fun mood(){
        println("On $date I felt melancholic")
    }
}