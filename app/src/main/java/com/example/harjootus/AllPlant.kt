package com.example.harjootus

import android.annotation.SuppressLint
import android.content.res.Resources.Theme
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.harjootus.data.Plant

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AllPlants(plantList: List<Plant>, navController: NavController){
    Scaffold (containerColor = MaterialTheme.colorScheme.primary,
        topBar = {
            TopAppBar(
                modifier = Modifier,
                title = {Text(stringResource(R.string.app_name))},
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screen.MarsPhotosApp.route)}) {
                        Icon(imageVector = Icons.Filled.List, contentDescription = "kuvaa")
                    }
                }
            )
        }
    ){
        LazyColumn(modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
        ){
            item {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        "\uD83C\uDF3F Plants in Cosmetics",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
            items(plantList) { plant ->
                PlantCard(plant.name, plant.description, plant.imageRes)
            }
        }
    }
}