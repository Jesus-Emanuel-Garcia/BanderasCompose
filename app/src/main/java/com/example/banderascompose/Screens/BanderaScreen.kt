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
import androidx.compose.ui.graphics.Path
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaScreen(modifier: Modifier){
    val constraintsNepal = ConstraintSet {
        val lienzoNepal = createRefFor("lienzoNepal")
        constrain(lienzoNepal) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

            width = Dimension.value(240.dp)
            height = Dimension.value(290.dp)
        }
    }

    ConstraintLayout(
        constraintSet = constraintsNepal,
        modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.layoutId("lienzoNepal")) {
            val w = size.width
            val h = size.height

            val azulBorde = Color(0xFF003893)
            val carmesi = Color(0xFFDC143C)
            val blanco = Color.White


            val siluetaNepal = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.95f, h * 0.45f)
                lineTo(w * 0.30f, h * 0.45f)
                lineTo(w * 0.85f, h)
                lineTo(0f, h)
                close()
            }


            drawPath(path = siluetaNepal, color = carmesi, style = Fill)


            drawPath(path = siluetaNepal, color = azulBorde, style = Stroke(width = 16f))


            val cxLuna = w * 0.28f
            val cyLuna = h * 0.28f
            val radioLuna = w * 0.12f


            drawCircle(
                color = blanco,
                radius = radioLuna,
                center = Offset(cxLuna, cyLuna)
            )

            drawCircle(
                color = carmesi,
                radius = radioLuna * 0.9f,
                center = Offset(cxLuna, cyLuna - (radioLuna * 0.3f))
            )

            val cxSol = w * 0.28f
            val cySol = h * 0.70f
            val radioExternoSol = w * 0.15f
            val radioInternoSol = radioExternoSol * 0.5f

            val pathSol = Path()
            for (i in 0 until 24) {
                val radioActual = if (i % 2 == 0) radioExternoSol else radioInternoSol
                // Rotación en pasos de 15 grados (360 / 24 = 15)
                val angulo = Math.toRadians((-90f + i * 15f).toDouble())

                val x = cxSol + radioActual * cos(angulo).toFloat()
                val y = cySol + radioActual * sin(angulo).toFloat()

                if (i == 0) pathSol.moveTo(x, y) else pathSol.lineTo(x, y)
            }
            pathSol.close()

            drawPath(path = pathSol, color = blanco)
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

