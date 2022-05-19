package com.worksmile.sideeffects.launched_effect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.worksmile.sideeffects.launched_effect.viewmodel.LaunchedEffectViewModel
import com.worksmile.sideeffects.ui.theme.SideEffectsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LaunchedEffect2Activity : ComponentActivity() {

    private var i = 0

    private val launchedEffectViewModel by viewModels<LaunchedEffectViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember {
                mutableStateOf("")
            }
            SideEffectsTheme {
                LaunchedEffect(key1 = true) {
                    launchedEffectViewModel.liveData.observe(this@LaunchedEffect2Activity) {

                    }
                }
            }
        }
    }
}