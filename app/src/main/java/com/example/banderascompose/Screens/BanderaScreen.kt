package com.example.banderascompose.Screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderascompose.R

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size

import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun PixelArt() {

    val vacio = Color.Transparent
    val negro = Color(0xFF1A1A1A)
    val naranja = Color(0xFFF05A28)
    val rojo = Color(0xFFED1C24)
    val amarillo = Color(0xFFFFF200)
    val celeste = Color(0xFF00ADEF)
    val blanco = Color.White
    val crema = Color(0xFFF3D2C1)

    val tamanoPixel = 20.dp

    Column(modifier = Modifier.fillMaxSize()) {


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(amarillo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(amarillo))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(blanco))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(blanco))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(celeste))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(celeste))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(crema))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(naranja))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }


        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(negro))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCorazonPixelArt() {
    PixelArt()
}

