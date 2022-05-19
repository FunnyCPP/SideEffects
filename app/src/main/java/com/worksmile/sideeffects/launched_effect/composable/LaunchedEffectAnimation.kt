package com.worksmile.sideeffects.launched_effect.composable

import androidx.compose.animation.core.Animatable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

@Composable
fun LaunchedEffectAnimation(
    counter: Float
) {
    val animatable = remember {
        Animatable(0F)
    }
    LaunchedEffect(key1 = counter) {
        animatable.animateTo(counter)
    }
}