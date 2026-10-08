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
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.shape.GenericShape


@Composable
fun BanderaScreen(modifier: Modifier){
    Canvas(modifier = Modifier.fillMaxSize().aspectRatio(1.5f)) {
        val width = size.width
        val height = size.height


        val origen = Offset(0f, height)


        val colorAzul = Color(0xFF003F87)
        val colorAmarillo = Color(0xFFFCD856)
        val colorRojo = Color(0xFFD62828)
        val colorBlanco = Color.White
        val colorVerde = Color(0xFF007A3D)


        val pathAzul = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(0f, 0f)
            lineTo(width / 3f, 0f)
            close()
        }
        drawPath(pathAzul, colorAzul)


        val pathAmarillo = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(width / 3f, 0f)
            lineTo(width *2f / 3f, 0f)
            close()
        }
        drawPath(pathAmarillo, colorAmarillo)


        val pathRojo = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(width * 2f / 3f, 0f)
            lineTo(width, 0f)
            close()
        }
        drawPath(pathRojo, colorRojo)


        val pathBlanco = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(width, 0f)
            lineTo(width, height / 3f)
            close()
        }
        drawPath(pathBlanco, colorBlanco)


        val pathVerde = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(width, height / 3f)
            lineTo(width, height)
            close()
        }
        drawPath(pathVerde, colorVerde)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

