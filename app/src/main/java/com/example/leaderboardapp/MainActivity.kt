package com.example.leaderboardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.leaderboardapp.ui.theme.LeaderBoardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeaderBoardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun LeaderBoardScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .width(375.dp)
                .height(489.dp)
                .background(
                    color = colorResource(R.color.blue)
                        .compositeOver(colorResource(R.color.blue_light))
                )
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Spacer(modifier = modifier.padding(start = 16.dp))
                Image(
                    painter = painterResource(R.drawable.trophy),
                    contentDescription = null,
                    modifier = modifier.size(48.dp)
                )
                Spacer(modifier = modifier.padding(start = 16.dp))
                Column {
                    Text(
                        text = stringResource(R.string.hello),
                        color = colorResource(R.color.white)
                    )
                    Spacer(modifier = modifier.padding(top = 8.dp))
                    Text(
                        text = stringResource(R.string.welcome_challenge),
                        color = colorResource(R.color.white)
                    )

                }
                Row(horizontalArrangement = Arrangement.End,modifier = modifier.fillMaxWidth()) {
                    Box(
                        modifier = modifier.padding(end = 16.dp)
                            .size(40.dp)
                            .clip(
                                RoundedCornerShape(8.dp)
                            )
                            .background(color = colorResource(R.color.white))

                    ) {

                        Image(
                            painter = painterResource(R.drawable.gift),
                            contentDescription = null,
                            modifier = modifier
                                .size(20.dp)
                                .align(Alignment.Center)
                        )
                    }
                }
            }

            Spacer( modifier = modifier.padding(top=12.dp))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LeaderBoardScreen()
}