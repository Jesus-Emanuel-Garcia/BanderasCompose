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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaScreen(modifier: Modifier){

    val constraintsPapua = ConstraintSet {
        val lienzoPrincipal = createRefFor("lienzoPrincipal")

        constrain(lienzoPrincipal) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }
    }


    ConstraintLayout(
        constraintSet = constraintsPapua,
        modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.layoutId("lienzoPrincipal")) {
            val w = size.width
            val h = size.height
            val colorRojo = Color(0xFFCE1126)
            val colorNegro = Color.Black
            val colorAmarillo = Color(0xFFFCD116)

            val pathNegro = Path().apply {
                moveTo(0f, 0f)
                lineTo(0f, h)
                lineTo(w, h)
            }
            drawPath(path = pathNegro, color = colorNegro)


            val pathRojo = Path().apply {
                moveTo(0f, 0f)
                lineTo(w, 0f)
                lineTo(w, h)
                close()
            }
            drawPath(path = pathRojo, color = colorRojo)


            fun drawStar(cx: Float, cy: Float, radius: Float, color: Color) {
                val pathEstrella = Path()
                val rInterno = radius * 0.38f
                for (i in 0 until 10) {
                    val rActual = if (i % 2 == 0) radius else rInterno
                    val angulo = Math.toRadians((-90f + i * 36f).toDouble())
                    val x = cx + rActual * cos(angulo).toFloat()
                    val y = cy + rActual * sin(angulo).toFloat()
                    if (i == 0) pathEstrella.moveTo(x, y) else pathEstrella.lineTo(x, y)
                }
                pathEstrella.close()
                drawPath(path = pathEstrella, color = color)
            }


            val radioEstrellaGrande = h * 0.06f
            val radioEstrellaPequeña = h * 0.04f

            drawStar(w * 0.25f, h * 0.25f, radioEstrellaGrande, Color.White)
            drawStar(w * 0.15f, h * 0.45f, radioEstrellaGrande, Color.White)
            drawStar(w * 0.35f, h * 0.45f, radioEstrellaGrande, Color.White)
            drawStar(w * 0.25f, h * 0.65f, radioEstrellaGrande, Color.White)
            drawStar(w * 0.30f, h * 0.55f, radioEstrellaPequeña, Color.White)


            val avePath = Path().apply {
                val cx = w * 0.75f
                val cy = h * 0.35f
                val scale = h * 0.15f


                moveTo(cx - scale, cy + scale)
                lineTo(cx - scale * 0.2f, cy)
                lineTo(cx - scale * 0.8f, cy - scale * 0.5f)
                lineTo(cx, cy - scale * 0.2f)
                lineTo(cx + scale, cy - scale)
                lineTo(cx + scale * 0.5f, cy)
                lineTo(cx + scale * 0.8f, cy + scale * 0.2f)
                lineTo(cx + scale * 0.2f, cy + scale * 0.4f)
                close()
            }
            drawPath(path = avePath, color = colorAmarillo)
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

