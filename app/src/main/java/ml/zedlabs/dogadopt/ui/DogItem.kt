package ml.zedlabs.dogadopt.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import ml.zedlabs.dogadopt.Dog
import ml.zedlabs.dogadopt.R
import ml.zedlabs.dogadopt.ui.theme.robotoCus

@Composable
fun DogItem(dog: Dog, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(8.dp))
            .clickable {
                val bundle = bundleOf("dog" to dog)
                navController.navigate(
                    R.id.action_dogListFragment_to_detailsFragment,
                    bundle
                )
            }
    )
    {
        Row(modifier = Modifier.padding(8.dp)) {

            Image(
                painter = painterResource(dog.imageDrawable),
                contentDescription = null,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .width(190.dp)
                    .height(190.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(verticalArrangement = Arrangement.SpaceAround) {
                Text(
                    text = dog.name,
                    style = robotoCus.body1,
                    fontSize = 20.sp,
                )
                Text(
                    text = dog.breed,
                    style = robotoCus.body1,
                    color = Color.Gray,
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = dog.about,
                    style = robotoCus.body1,
                    color = Color.Gray,
                    fontSize = 16.sp,
                )
                Text(
                    text = dog.location,
                    style = robotoCus.subtitle1,
                    color = Color.LightGray,
                    fontSize = 16.sp,
                )
            }

        }

    }
}