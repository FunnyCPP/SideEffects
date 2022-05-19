package com.worksmile.sideeffects.sideeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.worksmile.sideeffects.ui.theme.SideEffectsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SideEffectActivity : ComponentActivity() {

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember {
                mutableStateOf("")
            }
            SideEffectsTheme {
                Button(onClick = { text += "#" }) {
                    i++
                    Text(text = text)
                }
            }
        }
    }
}
