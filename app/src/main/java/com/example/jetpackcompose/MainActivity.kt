package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                NewStory()
            }
        }

    }
}

@Composable
fun NewStory() {
    val image = +imageResource(R.drawable.main)

    Column(
        modifier = Spacing(16.dp)
    ) {
        Container(expanded = true, height = 180.dp) {
            //Use the Clip() function to round the corners of the image
            Clip(shape = RoundedCornerShape(8.dp)) {
                //call DrawImage() to add the graphic to the app
                DrawImage(image)
            }
        }

        HeightSpacer(16.dp)

        Text(text = "A long time ago and far away there lived a King and a Queen.")
        Text(text = "They were very happy, for their first child, a girl, had been born.")
    }

}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}