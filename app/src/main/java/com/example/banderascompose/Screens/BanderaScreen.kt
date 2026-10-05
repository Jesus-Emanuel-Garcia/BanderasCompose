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
import com.example.banderascompose.R
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import kotlin.math.cos
import kotlin.math.sin
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.layoutId

@Composable
fun BanderaScreen(modifier: Modifier){

    val constraintsIsrael = ConstraintSet {
        val franjaSup = createRefFor("franjaSup")
        val franjaInf = createRefFor("franjaInf")
        val estrella = createRefFor("estrella")

        constrain(franjaSup) {
            top.linkTo(parent.top, margin = 32.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.percent(0.15f)
        }

        constrain(franjaInf) {
            bottom.linkTo(parent.bottom, margin = 32.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.percent(0.15f)
        }

        constrain(estrella) {
            top.linkTo(franjaSup.bottom)
            bottom.linkTo(franjaInf.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }
    }


    ConstraintLayout(
        constraintSet = constraintsIsrael,
        modifier = modifier.fillMaxSize().background(Color.White)
    ) {
        val azulIsrael = Color(0xFF0038B8)


        Box(modifier = Modifier.layoutId("franjaSup").background(azulIsrael))
        Box(modifier = Modifier.layoutId("franjaInf").background(azulIsrael))


        Canvas(modifier = Modifier.layoutId("estrella")) {
            val cx = size.width / 2f
            val cy = size.height / 2f
            val radio = size.height * 0.35f


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


            drawPath(path = trianglePath(cx, cy, radio, -90f), color = azulIsrael, style = Stroke(width = 16f))
            drawPath(path = trianglePath(cx, cy, radio, 90f), color = azulIsrael, style = Stroke(width = 16f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

