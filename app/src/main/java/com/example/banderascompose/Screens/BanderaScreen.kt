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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaScreen(modifier: Modifier){

    val constraintsTurquia = ConstraintSet {
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
        constraintSet = constraintsTurquia,
        modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.layoutId("lienzoPrincipal")) {
            val colorRojo = Color(0xFFE30A17)
            val cy = size.height / 2f


            drawRect(color = colorRojo)


            drawCircle(
                color = Color.White,
                radius = size.height * 0.30f,
                center = Offset(size.width * 0.38f, cy)
            )

            drawCircle(
                color = colorRojo,
                radius = size.height * 0.24f,
                center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
            )


            val cxEstrella = size.width * 0.65f
            val rExterno = size.height * 0.12f
            val rInterno = rExterno * 0.38f
            val pathEstrella = Path()

            for (i in 0 until 10) {
                val radio = if (i % 2 == 0) rExterno else rInterno
                val angulo = Math.toRadians((-90f + i * 36f).toDouble())

                val x = cxEstrella + radio * cos(angulo).toFloat()
                val y = cy + radio * sin(angulo).toFloat()

                if (i == 0) pathEstrella.moveTo(x, y) else pathEstrella.lineTo(x, y)
            }
            pathEstrella.close()
            drawPath(path = pathEstrella, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

