package ml.zedlabs.dogadopt.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ml.zedlabs.dogadopt.DogData
import ml.zedlabs.dogadopt.ui.theme.robotoCus
import ml.zedlabs.dogadopt.ui.theme.typography

@Composable
fun DogList(navController: NavController) {
    Scaffold(
        topBar = {
            Text(
                text = "🐶 Adopt",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp),
                style = robotoCus.subtitle1,
                fontSize = 28.sp,
            )
        },
        backgroundColor = DogData.getColorLight(),
        floatingActionButton = {
            FloatingActionButton(onClick = {},
            modifier = Modifier.width(70.dp)) {
                Icon(Icons.Rounded.Pets, "paws", tint = Color.Yellow)
            }

        }

    ) {
        LazyColumn {
            itemsIndexed(items = DogData.dogList) { _, dog ->
                DogItem(dog, navController)
            }
        }
    }

}