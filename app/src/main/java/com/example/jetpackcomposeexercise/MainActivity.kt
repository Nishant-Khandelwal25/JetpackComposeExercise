package com.example.jetpackcomposeexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.roboto_medium, FontWeight.Medium),
            Font(R.font.roboto_bold, FontWeight.Bold),
            Font(R.font.roboto_light, FontWeight.Light)
        )
        setContent {
            /*   Row(
                   modifier = Modifier
                       .fillMaxSize(0.5f)
                       .background(Color.Green),
                   verticalAlignment = Alignment.Bottom,
                   horizontalArrangement = Arrangement.SpaceAround,
               ) {
                   Text(text = "Hello")
                   Text(text = "World")
               }*/

            /*Column(
                modifier = Modifier
                    .fillMaxSize(0.5f)
                    .background(Color.Blue),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.End
            ) {
                Text(text = "Hello1")
                Text(text = "World1")
            }*/

            /*val painter = painterResource(id = R.drawable.sample)
            val contentDescription = "This is a sample image used for tutorial"

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)
            ) {
                ImageCard(
                    painter = painter,
                    contentDescription = contentDescription,
                    title = contentDescription
                )
            }*/

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 60.sp
                            )
                        ) {
                            append("N")
                        }
                        append("ishant ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
                                fontSize = 60.sp
                            )
                        ) {
                            append("K")
                        }
                        append("handelwal")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Box(modifier = Modifier.height(200.dp)) {
            Image(
                painter = painter, contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
}