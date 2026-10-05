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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun BanderaScreen(modifier: Modifier){
    val constraintsSudafrica = ConstraintSet {
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
        constraintSet = constraintsSudafrica,
        modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.layoutId("lienzoPrincipal")) {
            val w = size.width
            val h = size.height


            val rojo = Color(0xFFE03C31)
            val azul = Color(0xFF001489)
            val verde = Color(0xFF007749)
            val dorado = Color(0xFFFFB81C)
            val negro = Color.Black
            val blanco = Color.White


            drawRect(color = rojo, topLeft = Offset(0f, 0f), size = Size(w, h / 2f))
            drawRect(color = azul, topLeft = Offset(0f, h / 2f), size = Size(w, h / 2f))

            val apex = Offset(w * 0.36f, h / 2f)

            val grosorBlanco = h * 0.30f
            drawLine(blanco, Offset(0f, 0f), apex, grosorBlanco)
            drawLine(blanco, Offset(0f, h), apex, grosorBlanco)
            drawLine(blanco, apex, Offset(w, h / 2f), grosorBlanco)


            val grosorVerde = h * 0.20f
            drawLine(verde, Offset(0f, 0f), apex, grosorVerde)
            drawLine(verde, Offset(0f, h), apex, grosorVerde)
            drawLine(verde, apex, Offset(w, h / 2f), grosorVerde)


            val pathDorado = Path().apply {
                moveTo(0f, 0f)
                lineTo(w * 0.36f, h / 2f)
                lineTo(0f, h)
                close()
            }
            drawPath(path = pathDorado, color = dorado)

            val pathNegro = Path().apply {
                moveTo(0f, h * 0.12f)
                lineTo(w * 0.27f, h / 2f)
                lineTo(0f, h * 0.88f)
                close()
            }
            drawPath(path = pathNegro, color = negro)
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

