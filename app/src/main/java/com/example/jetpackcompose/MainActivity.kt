package com.example.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview
import kotlin.random.Random

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
    Column(modifier = Spacing(16.dp)) {
        Text(text = "A long time ago and far away there lived a King and a Queen.")
        Text(text = "They were very happy, for their first child, a girl, had been born.")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}