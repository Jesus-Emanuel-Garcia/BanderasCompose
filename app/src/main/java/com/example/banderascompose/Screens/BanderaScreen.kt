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
import kotlin.math.cos
import kotlin.math.sin

fun Path.star(
    centerX: Float,
    centerY: Float,
    outerRadius: Float,
    innerRadius: Float,
    points: Int = 8
) {
    val angle = Math.PI / points
    moveTo(
        centerX + outerRadius * cos(-Math.PI / 2).toFloat(),
        centerY + outerRadius * sin(-Math.PI / 2).toFloat()
    )
    for (i in 1 until points * 2) {
        val radius = if (i % 2 == 0) outerRadius else innerRadius
        val a = -Math.PI / 2 + i * angle
        lineTo(
            centerX + radius * cos(a).toFloat(),
            centerY + radius * sin(a).toFloat()
        )
    }
    close()
}


@Composable
fun BanderaScreen(modifier: Modifier){
    Canvas(modifier = Modifier.fillMaxSize().aspectRatio(1.5f)) {
        val width = size.width
        val height = size.height

        val origen = Offset(0f, width)


        val colorRojo = Color(0xFFD62828)
        val colorNegro = Color.Black


        val pathNegro = Path().apply {
            moveTo(0f, 0f)
            lineTo(0f, height)
            lineTo(width, height)
            close()
        }
        drawPath(pathNegro, colorNegro)

        val pathRojo = Path().apply {
            moveTo(0f, 0f)
            lineTo(width, 0f)
            lineTo(width, height)
            close()
        }
        drawPath(pathRojo, colorRojo)

        val triWidth = size.width * 0.38f
        val centrox = triWidth * 0.22f
        val centroy = size.height / 2f

        val starPath = Path().apply {
            val radioEXT = triWidth * 0.18f
            val radioINT = radioEXT * 0.45f

            star(
                centerX = centrox,
                centerY = centroy,
                outerRadius = radioEXT,
                innerRadius = radioINT
            )

        }
        drawPath(starPath, color = Color.Yellow)
    }

}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

