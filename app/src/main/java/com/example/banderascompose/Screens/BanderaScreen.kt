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
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaScreen(modifier: Modifier){
    Canvas(modifier = Modifier.fillMaxSize()) {
        val width = size.width
        val height = size.height

        // Colores base
        val azulBorde = Color(0xFF003893)
        val carmesi = Color(0xFFDC143C)
        val blanco = Color.White


        val pathSuperiorAzul = Path().apply {
            moveTo(width * 0.1f, height * 0.05f)
            lineTo(width * 0.85f, height * 0.30f)
            lineTo(width * 0.1f, height * 0.55f)
            close()
        }
        drawPath(pathSuperiorAzul, color = azulBorde)


        val pathSuperiorRojo = Path().apply {
            moveTo(width * 0.15f, height * 0.12f)
            lineTo(width * 0.75f, height * 0.30f)
            lineTo(width * 0.15f, height * 0.48f)
            close()
        }
        drawPath(pathSuperiorRojo, color = carmesi)

        val pathInferiorAzul = Path().apply {
            moveTo(width * 0.1f, height * 0.45f)
            lineTo(width * 0.95f, height * 0.70f)
            lineTo(width * 0.1f, height * 0.95f)
            close()
        }
        drawPath(pathInferiorAzul, color = azulBorde)


        val pathInferiorRojo = Path().apply {
            moveTo(width * 0.15f, height * 0.51f)
            lineTo(width * 0.85f, height * 0.70f)
            lineTo(width * 0.15f, height * 0.89f)
            close()
        }
        drawPath(pathInferiorRojo, color = carmesi)


        val lunaCentroX = width * 0.32f
        val lunaCentroY = height * 0.30f
        val radioLuna = height * 0.06f

        drawCircle(color = blanco, radius = radioLuna, center = Offset(lunaCentroX, lunaCentroY))

        drawCircle(
            color = carmesi,
            radius = radioLuna * 0.8f,
            center = Offset(lunaCentroX, lunaCentroY - height * 0.015f)
        )
        val solCentroX = width * 0.35f
        val solCentroY = height * 0.70f
        val radioSol = height * 0.05f

        // Centro del sol
        drawCircle(color = blanco, radius = radioSol, center = Offset(solCentroX, solCentroY))

    }

}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

