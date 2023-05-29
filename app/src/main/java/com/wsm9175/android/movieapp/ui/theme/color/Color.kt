package com.wsm9175.android.movieapp.ui.theme.color

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

sealed class ColorSet{
    open lateinit var LightColors : MyColors
    open lateinit var DarkColors : MyColors
}