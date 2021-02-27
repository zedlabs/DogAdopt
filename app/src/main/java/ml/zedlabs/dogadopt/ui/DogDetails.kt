package ml.zedlabs.dogadopt.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ml.zedlabs.dogadopt.Dog
import ml.zedlabs.dogadopt.DogData
import ml.zedlabs.dogadopt.ui.theme.robotoCus

@Composable
fun DogDetails(dog: Dog) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                modifier = Modifier.width(60.dp)
                    .height(60.dp)
            ) {
                Icon(
                    Icons.Rounded.Favorite, "paws",
                    tint = Color.Yellow,
                    modifier = Modifier.height(60.dp)
                )
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(DogData.getColorLight())
        ) {

            Card(
                Modifier.clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth().padding(16.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = dog.name,
                        style = robotoCus.body1,
                        fontSize = 24.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )
                    Divider()
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Image(
                            painter = painterResource(dog.imageDrawable),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(8.dp))
                                .width(220.dp)
                                .height(250.dp),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {

                            Text(
                                text = dog.breed,
                                style = robotoCus.body1,
                                color = Color.Gray,
                                fontSize = 18.sp,
                            )
                            Text(
                                text = dog.about,
                                style = robotoCus.body1,
                                color = Color.Gray,
                                fontSize = 18.sp,
                            )
                            Text(
                                text = dog.location,
                                style = robotoCus.subtitle1,
                                color = Color.LightGray,
                                fontSize = 20.sp,
                            )
                        }

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Divider()
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = dog.bio,
                        style = robotoCus.body1,
                        fontSize = 18.sp,
                    )

                }
            }
        }

    }

}