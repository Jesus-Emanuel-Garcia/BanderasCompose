package com.example.banderascompose.Screens

import android.media.Image
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.ui.geometry.Offset
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
import androidx.compose.ui.graphics.Path
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaScreen(modifier: Modifier){
    Canvas(modifier = modifier.fillMaxSize().aspectRatio(1.5f)) {

        drawRect(color = Color(0xFFE30A17))
        val cy = size.height / 2f
        val rOut = size.height * 0.30f
        drawCircle(color = Color.White, radius = rOut,
            center = Offset(size.width * 0.38f, cy))
        drawCircle(color = Color(0xFFE30A17), radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy))
        val starCenterX = size.width * 0.58f
        val starCenterY = cy
        val starOuterRadius = size.height * 0.12f
        val starInnerRadius = starOuterRadius / 2.5f

        val starPath = Path().apply {
            val numPoints = 5
            val angle = PI / numPoints

            var currentAngle = -PI / -2

            for (i in 0 until numPoints * 2) {
                val radius = if (i % 2 == 0) starOuterRadius else starInnerRadius
                val x = starCenterX + (radius * cos(currentAngle)).toFloat()
                val y = starCenterY + (radius * sin(currentAngle)).toFloat()

                if (i == 0) {
                    moveTo(x, y)
                } else {
                    lineTo(x, y)
                }

                currentAngle += angle
            }
            close()
        }

        drawPath(path = starPath, color = Color.White)

    }

}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

