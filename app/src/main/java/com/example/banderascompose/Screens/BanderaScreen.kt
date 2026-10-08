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
fun CorazonPixelArt() {
    // Definimos los colores y el tamaño del píxel para no repetir tanto código
    val rojo = Color.Red
    val vacio = Color.Transparent
    val tamanoPixel = 32.dp

    // El contenedor vertical principal
    Column(modifier = Modifier.fillMaxSize()) {

        // Fila 1:  [Vacio] [Rojo] [Vacio] [Rojo] [Vacio]
        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }

        // Fila 2:  [Rojo] [Rojo] [Rojo] [Rojo] [Rojo]
        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
        }

        // Fila 3:  [Rojo] [Rojo] [Rojo] [Rojo] [Rojo]
        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
        }

        // Fila 4:  [Vacio] [Rojo] [Rojo] [Rojo] [Vacio]
        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }

        // Fila 5:  [Vacio] [Vacio] [Rojo] [Vacio] [Vacio]
        Row {
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(rojo))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
            Box(modifier = Modifier.size(tamanoPixel).background(vacio))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCorazonPixelArt() {
    CorazonPixelArt()
}

