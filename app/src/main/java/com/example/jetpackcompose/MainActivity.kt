package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
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
    val image = +imageResource(R.drawable.head)

    Column(
        modifier = Spacing(16.dp)
    ) {
        Container(modifier = Height(180.dp) wraps Expanded) {
            // https://stackoverflow.com/questions/58764407/imageresource-from-r-drawable-causes-illegalargumentexception-in-jetpack-compos
            DrawImage(image)
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