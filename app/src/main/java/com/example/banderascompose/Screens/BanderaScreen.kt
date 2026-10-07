package com.example.banderascompose.Screens

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.foundation.Canvas
import androidx.compose.ui.graphics.drawscope.Stroke



fun trianglePath(cx: Float, cy: Float, r: Float, rotationDeg: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    return path
}
@Composable
fun BanderaScreen(modifier: Modifier){

    val israelBlue = Color(0xFF0038B8)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(25f)
                .background(israelBlue)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(65f),
            contentAlignment = Alignment.Center
        ) {
            Canvas(modifier = modifier.size(100.dp)) {
                val cx = size.width / 2f
                val cy = size.height / 2f
                val r = size.width / 2f
                val pathUp = trianglePath(cx = cx, cy = cy, r = r, rotationDeg = -90f)
                val pathDown = trianglePath(cx = cx, cy = cy, r = r, rotationDeg = 90f)
                val strokeStyle = Stroke(width = 8f)

                drawPath(
                    path = pathUp,
                    Color.Blue,
                    style = strokeStyle
                )

                drawPath(
                    path = pathDown,
                    Color.Blue,
                    style = strokeStyle
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(25f)
                .background(israelBlue)
        )


    }
    }


@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

