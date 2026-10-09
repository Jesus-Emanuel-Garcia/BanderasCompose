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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import kotlin.math.cos
import kotlin.math.sin

fun Path.star(
    centerX: Float,
    centerY: Float,
    outerRadius: Float,
    innerRadius: Float,
    points: Int = 5
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

        val origen = Offset(0f, height)



        val pathRojo = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(width * 0f / 3f, 0f)
            lineTo(width, 0f)
            close()
        }
        drawPath(pathRojo, Color.Yellow)

        val pathBlanco = Path().apply {
            moveTo(origen.x, origen.y)
            lineTo(width, 0f)
            lineTo(width, height / 1f)
            close()
        }
        drawPath(pathBlanco, Color.Red)

            val colorDragon = Color.White
            val colorEstrellas = Color(0xFFFFD700)


            val pathCuerpo = Path().apply {

                moveTo(width * 0.38f, height * 0.62f)
                lineTo(width * 0.40f, height * 0.54f)
                lineTo(width * 0.43f, height * 0.58f)
                lineTo(width * 0.47f, height * 0.51f)
                lineTo(width * 0.50f, height * 0.55f)
                lineTo(width * 0.54f, height * 0.48f)
                lineTo(width * 0.57f, height * 0.52f)
                lineTo(width * 0.61f, height * 0.46f)
                lineTo(width * 0.62f, height * 0.50f)
            }


            drawPath(
                path = pathCuerpo,
                color = colorDragon,
                style = Stroke(
                    width = height * 0.045f,
                    cap = StrokeCap.Round,
                    join = StrokeJoin.Round
                )
            )


            val detallesDragon = Path().apply {

                moveTo(width * 0.38f, height * 0.62f)
                lineTo(width * 0.35f, height * 0.64f)
                lineTo(width * 0.38f, height * 0.65f)
                close()


                moveTo(width * 0.48f, height * 0.51f)
                lineTo(width * 0.47f, height * 0.47f)
                lineTo(width * 0.50f, height * 0.51f)
                close()


                moveTo(width * 0.55f, height * 0.48f)
                lineTo(width * 0.54f, height * 0.44f)
                lineTo(width * 0.57f, height * 0.48f)
                close()
            }
            drawPath(detallesDragon, color = colorDragon)



            val radioEXT = height * 0.02f
            val radioINT = radioEXT * 0.4f
            val estrellasPath = Path().apply {

                star(
                    centerX = width * 0.40f,
                    centerY = height * 0.55f,
                    outerRadius = radioEXT,
                    innerRadius = radioINT
                )

                star(
                    centerX = width * 0.48f,
                    centerY = height * 0.53f,
                    outerRadius = radioEXT,
                    innerRadius = radioINT
                )

                star(
                    centerX = width * 0.56f,
                    centerY = height * 0.50f,
                    outerRadius = radioEXT,
                    innerRadius = radioINT
                )

                star(
                    centerX = width * 0.61f,
                    centerY = height * 0.48f,
                    outerRadius = radioEXT,
                    innerRadius = radioINT
                )
            }
            drawPath(estrellasPath, color = colorEstrellas)
        }

    }




@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

