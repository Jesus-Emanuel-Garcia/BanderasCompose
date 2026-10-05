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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun BanderaScreen(modifier: Modifier){
    val constraintsSeychelles = ConstraintSet {
        val lienzo = createRefFor("lienzo")

        constrain(lienzo) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }
    }

    // 2. Componente Visual
    ConstraintLayout(
        constraintSet = constraintsSeychelles,
        modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.layoutId("lienzo")) {
            val w = size.width
            val h = size.height
            val origin = Offset(0f, h)


            val azul = Color(0xFF003F87)
            val amarillo = Color(0xFFFCD856)
            val rojo = Color(0xFFD62828)
            val blanco = Color.White
            val verde = Color(0xFF007A3D)


            val pathAzul = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(0f, 0f)
                lineTo(w / 3f, 0f)
                close()
            }
            drawPath(path = pathAzul, color = azul)
            val pathAmarilla = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(w / 3f, 0f)
                lineTo(w * (2f / 3f), 0f)
                close()
            }
            drawPath(path = pathAmarilla, color = amarillo)


            val pathRoja = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(w * (2f / 3f), 0f)
                lineTo(w, 0f)
                lineTo(w, h / 3f)
                close()
            }
            drawPath(path = pathRoja, color = rojo)


            val pathBlanca = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(w, h / 3f)
                lineTo(w, h * (2f / 3f))
                close()
            }
            drawPath(path = pathBlanca, color = blanco)


            val pathVerde = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(w, h * (2f / 3f))
                lineTo(w, h)
                close()
            }
            drawPath(path = pathVerde, color = verde)
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

