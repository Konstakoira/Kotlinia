package com.example.harjootus

sealed class Screen (val route: String){
    object AllPlant : Screen("first")
    object MarsPhotosApp : Screen("third")
}