package com.worksmile.sideeffects.side_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectDemo() {
    SideEffect {
        println("Called after every recomposition")
    }
}