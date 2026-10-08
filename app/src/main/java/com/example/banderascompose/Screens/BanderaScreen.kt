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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio

@Composable
fun BanderaScreen(modifier: Modifier){
    Canvas(modifier = Modifier.fillMaxSize().aspectRatio(1.5f)) {
        val width = size.width
        val height = size.height

        drawRect(
            color = Color(0xFF001489),
            size = Size(width, height / 2f)
        )
        drawRect(
            color = Color(0xFFFFB612),
            topLeft = Offset(0f, height / 2f),
            size = Size(width, height / 2f)
        )


        val apexBlanco = Offset(width * 0.36f, height / 2f)
        val grosorBlanco = height * 0.30f


        drawLine(Color.White, Offset(0f, 0f), apexBlanco, strokeWidth = grosorBlanco)
        drawLine(Color.White, Offset(0f, height), apexBlanco, strokeWidth = grosorBlanco)
        drawLine(Color.White, apexBlanco, Offset(width, height * 0.14f), strokeWidth = grosorBlanco)
        drawLine(Color.White, apexBlanco, Offset(width, height * 0.86f), strokeWidth = grosorBlanco)


        val apexVerde = Offset(width * 0.37f, height * 0.51f)

        val colorVerde = Color(0xFF007749)
        val grosorVerde = height * 0.20f


        drawLine(colorVerde, Offset(-2f, -2f), apexVerde, strokeWidth = grosorVerde)
        drawLine(colorVerde, Offset(-2f, height + 2f), apexVerde, strokeWidth = grosorVerde)
        drawLine(colorVerde, apexVerde, Offset(width + 2f, height * 0.15f), strokeWidth = grosorVerde)
        drawLine(colorVerde, apexVerde, Offset(width + 2f, height * 0.85f), strokeWidth = grosorVerde)


        val pathNegro = Path().apply {
            moveTo(0f, 0f)
            lineTo(0f, height)
            lineTo(width * 0.33f, height * 0.5f)
            close()
        }
        drawPath(pathNegro, Color.Black)
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

