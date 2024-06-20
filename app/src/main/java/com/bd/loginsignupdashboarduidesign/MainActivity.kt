package com.bd.loginsignupdashboarduidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            dashboard()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    private fun dashboard()
    {
        Column(
            Modifier.fillMaxHeight().fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#f8eeec"))),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            ConstraintLayout {
                val (topImg, profile) = createRefs()
                Box(Modifier
                    .fillMaxWidth().height(245.dp)
                    .constrainAs(topImg) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(android.graphics.Color.parseColor("#EA6D35")),
                                Color(android.graphics.Color.parseColor("#3b608c"))
                            )
                        ), shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp)
                    )
                )
                Row(
                    modifier = Modifier
                        .padding(top = 48.dp, start = 24.dp, end = 24.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .height(100.dp)
                            .padding(start = 14.dp)
                            .weight(.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    )
                    {
                        Text(text = "Hello", color = Color.White, fontSize = 18.sp)
                        Text(
                            text = "David Friedman",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 14.dp)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .clickable { }
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, start = 24.dp, end = 24.dp)
                        .shadow(3.dp, shape = RoundedCornerShape(20.dp))
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                        .constrainAs(profile)
                        {
                            top.linkTo(topImg.bottom)
                            bottom.linkTo(topImg.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                )
                {
                    Column(
                        modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffe0c8")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.video_call),
                            contentDescription = null,
                            Modifier.padding(top = 8.dp, bottom = 4.dp)
                        )
                        Text(
                            text = "Video Call",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic,
                            color = Color(android.graphics.Color.parseColor("#c77710"))
                        )

                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffe0c8")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.notification),
                            contentDescription = null,
                            Modifier.padding(top = 8.dp, bottom = 4.dp)
                        )
                        Text(
                            text = "Notification",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic,
                            color = Color(android.graphics.Color.parseColor("#c77710"))
                        )

                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp, end = 12.dp)
                            .height(90.dp)
                            .width(90.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffe0c8")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.voice_call),
                            contentDescription = null,
                            Modifier.padding(top = 8.dp, bottom = 4.dp)
                        )
                        Text(
                            text = "Voice Call",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic,
                            color = Color(android.graphics.Color.parseColor("#c77710"))
                        )

                    }
                }
            }

                var text by rememberSaveable { mutableStateOf("")}

                TextField(value = text,
                    onValueChange = { text = it },
                    label = { Text(text = "Search for ...") },
                    trailingIcon = {
                        Image(
                            painter = painterResource(R.drawable.search_icon),
                            contentDescription = null,
                            modifier = Modifier.size(43.dp).padding(end = 6.dp)
                        )
                    },
                    shape = RoundedCornerShape(50.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        unfocusedLabelColor = Color(android.graphics.Color.parseColor("#5e5e5e"))
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, end = 24.dp, start = 24.dp)
                        .shadow(3.dp, shape = RoundedCornerShape(50.dp))
                        .background(Color.White, CircleShape)
                    )

            ConstraintLayout(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, end  =  24.dp, start = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(25.dp))
                .height(145.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(android.graphics.Color.parseColor("#4c6184")),
                            Color(android.graphics.Color.parseColor("#f9c177")),
                        )
                    ), shape = RoundedCornerShape(25.dp)
                )
            )
            {
                val (img, text1, text2)  =  createRefs()
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.constrainAs(img) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    },
                )
                Text(text = "To Get Unlimited",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .constrainAs(text1){
                            top.linkTo(parent.top)
                            end.linkTo(img.start)
                            start.linkTo(parent.start)
                        }
                )
                Text(text = "Upgrade Your Account",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .constrainAs(text2){
                            top.linkTo(text1.top)
                            end.linkTo(text1.end)
                            start.linkTo(text1.start)
                        }
                )
            }
        }
    }
}