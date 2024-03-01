package com.example.mybusinnesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybusinnesscardapp.ui.theme.MyBusinnessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinnessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardInfo()
                }
            }
        }
    }
}

@Composable
fun CardInfo(){

    Box(
        modifier = Modifier
            .background(color = Color(210, 232, 212))
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
           UserInfo(name = "PETER MICHUKI", title = "Android Developer Extraordinary")
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(bottom = 16.dp)

        ) {
          ContactInfo(phonenumber = "+254797243918", socialmediahandle = "@Android Dev", email = "petermichuki2022@gmailcom")
        }
    }

}



@Composable
private fun UserInfo(name: String, title:String) {
    val image = painterResource(id = R.drawable.android_logo)
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.8f)
    ){
        Box(
            modifier = Modifier
                .size(75.dp, 70.dp) // Set size as needed
                .background(color = Color(7, 48, 66)) // Set background color
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(75.dp, 70.dp) // Ensure the same size as the Box
            )
        }

        Text(
            text = name,
            fontSize = 25.sp,
            lineHeight = 70.sp
        )
        Text(
            text = title,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color =  Color(9, 114, 64),
        )
        
    }


}
@Composable
private fun ContactInfo(phonenumber: String, socialmediahandle: String, email: String, modifier: Modifier = Modifier) {
    Column (


    ){
        Row {
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = "Phone Number",
                tint = Color(0, 102, 50)
            )
            Text(
                text = phonenumber,
            )
        }
        Row {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "My Portfolio",
                tint = Color(0, 102, 50)
            )
            Text(
                text = socialmediahandle,

                )

        }
        Row {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = "My Portfolio",
                tint = Color(0, 102, 50)// Optional: set tint color
            )
            Text(
                text = email,

                )

        }


    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyBusinnessCardAppTheme {
        CardInfo()
    }
}