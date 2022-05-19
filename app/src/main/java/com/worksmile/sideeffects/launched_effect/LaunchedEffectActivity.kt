package com.worksmile.sideeffects.launched_effect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.worksmile.sideeffects.ui.theme.SideEffectsTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class LaunchedEffectActivity : ComponentActivity() {

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember {
                mutableStateOf("")
            }
            SideEffectsTheme {
                LaunchedEffect(key1 = text) {
                    delay(1000L)
                    println("The text is $text")
                }
                Button(onClick = { text += "#" }) {
                    i++
                    Text(text = text)
                }
            }
        }
    }
}