package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val cat = Cat(name="Abdou", age=21)
        val dog = Dog(name="Abdou2", age=2)
        val scorpion = Scorpion(name="Abdou3", age=1)

//        val pets = mutableListOf<Pet>()
//        pets.add(cat)
//        pets.add(dog)
//        pets.add(scorpion)
        val pets = mutableListOf<Pet>(cat, dog, scorpion)
        val pettablePets = mutableListOf<Pettable>(cat, dog)
    }
}