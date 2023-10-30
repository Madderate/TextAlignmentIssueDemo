package com.madderate.textalignmentissuedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.madderate.textalignmentissuedemo.ui.theme.TextAlignmentIssueDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ComposeView>(R.id.main_compose_view)?.setContent {
            TextAlignmentIssueDemoTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier
                .wrapContentHeight()
                .background(
                    color = Color(0xffed7760),
                    shape = RoundedCornerShape(CornerSize(6.dp))
                ),
            fontSize = 24.sp,
            text = "测试文字",
            color = Color.White,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextAlignmentIssueDemoTheme {
        Greeting()
    }
}