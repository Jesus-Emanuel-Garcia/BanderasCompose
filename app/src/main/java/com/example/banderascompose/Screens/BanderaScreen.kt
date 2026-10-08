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


@Composable
fun BanderaScreen(modifier: Modifier){
    Canvas(modifier = Modifier.fillMaxSize().aspectRatio(1.5f)) {
        val width = size.width
        val height = size.height


        val azulMarino = Color(0xFF00247D)
        drawRect(color = azulMarino)

        val grosorDiagonalBlanca = height * 0.22f


        drawLine(
            color = Color.White,
            start = Offset(-5f, -5f),
            end = Offset(width + 5f, height + 8f),
            strokeWidth = grosorDiagonalBlanca
        )

        drawLine(
            color = Color.White,
            start = Offset(-5f, height + 5f),
            end = Offset(width + 5f, -5f),
            strokeWidth = grosorDiagonalBlanca * 0.95f
        )


        val colorRojo = Color(0xFFCF142B)
        val grosorDiagonalRoja = grosorDiagonalBlanca * 0.35f


        drawLine(
            color = colorRojo,
            start = Offset(-10f, -2f),
            end = Offset(width + 8f, height + 10f),
            strokeWidth = grosorDiagonalRoja
        )


        drawLine(
            color = colorRojo,
            start = Offset(-8f, height + 8f),
            end = Offset(width + 12f, -12f),
            strokeWidth = grosorDiagonalRoja
        )



        val centroX = width * 0.5f
        val centroY = height * 0.5f
        val grosorCruzBlanca = height * 0.30f


        drawLine(
            color = Color.White,
            start = Offset(0f, centroY),
            end = Offset(width, centroY),
            strokeWidth = grosorCruzBlanca
        )

        drawLine(
            color = Color.White,
            start = Offset(centroX, 0f),
            end = Offset(centroX, height),
            strokeWidth = grosorCruzBlanca
        )


        val grosorCruzRoja = grosorCruzBlanca * 0.50f

        drawLine(
            color = colorRojo,
            start = Offset(0f, centroY + 4f),
            end = Offset(width, centroY + 2f),
            strokeWidth = grosorCruzRoja
        )

        drawLine(
            color = colorRojo,
            start = Offset(centroX - 3f, 0f),
            end = Offset(centroX - 3f, height),
            strokeWidth = grosorCruzRoja
        )
    }



}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

