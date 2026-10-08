package com.example.banderascompose.Screens

import android.media.Image
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.drawscope.Stroke
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
import androidx.compose.foundation.layout.size
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun BanderaScreen(modifier: Modifier){

    fun Path.star(
        centerX: Float,
        centerY: Float,
        outerRadius: Float,
        innerRadius: Float
    ) {
        val points = 5
        val angle = (2.0 * Math.PI / points).toFloat()
        val halfAngle = angle / 2f

        moveTo(
            centerX,
            centerY - outerRadius
        )

        for (i in 1 until points * 2) {
            val r = if (i % 2 == 0) outerRadius else innerRadius
            val a = i * halfAngle - Math.PI.toFloat() / 2f

            val x = centerX + (r * kotlin.math.cos(a))
            val y = centerY + (r * kotlin.math.sin(a))

            lineTo(x, y)
        }

        close()
    }

    Canvas(modifier = modifier.fillMaxSize().aspectRatio(1.5f)) {
        val band = size.height / 5f
        for (i in 0 until 5) {
            if (i % 2 == 0) drawRect(
                color = Color(0xFF002E6E),
                topLeft = Offset(0f, i * band),
                size = Size(size.width, band)
            )
        }



        val triWidth = size.width * 0.38f
        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, size.height / 2f)
            lineTo(0f, size.height)
            close()
        }



        val centrox = triWidth / 3f
        val centroy = size.height / 2f
        val starPath = Path().apply {
            val radioEXT = triWidth * 0.28f
            val radioINT = radioEXT * 0.40f

            star(
                centerX = centrox,
                centerY = centroy,
                outerRadius = radioEXT,
                innerRadius = radioINT
            )
        }

        drawPath(trianglePath, color = Color(0xFFCB1428))
        drawPath(starPath, color = Color.White)





    }

}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

