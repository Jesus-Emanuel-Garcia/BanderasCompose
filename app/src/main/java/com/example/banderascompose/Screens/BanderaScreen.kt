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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet


@Composable
fun BanderaScreen(modifier: Modifier){
    val constraintsButan = ConstraintSet {
        val fondoDiagonal = createRefFor("fondoDiagonal")
        val figuraDragon = createRefFor("figuraDragon")


        constrain(fondoDiagonal) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }


        constrain(figuraDragon) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

            width = Dimension.percent(0.6f)
            height = Dimension.percent(0.2f)
        }
    }

    ConstraintLayout(
        constraintSet = constraintsButan,
        modifier = modifier.fillMaxSize()
    ) {
        val amarilloButan = Color(0xFFFFD520)
        val naranjaButan = Color(0xFFFF4E12)
        val blanco = Color.White


        Canvas(modifier = Modifier.layoutId("fondoDiagonal")) {
            val w = size.width
            val h = size.height


            drawRect(color = amarilloButan)


            val pathNaranja = Path().apply {
                moveTo(0f, h)
                lineTo(w, 0f)
                lineTo(w, h)
                close()
            }
            drawPath(path = pathNaranja, color = naranjaButan)
        }

        Canvas(
            modifier = Modifier
                .layoutId("figuraDragon")
                .rotate(-35f)
        ) {
            val w = size.width
            val h = size.height


            val pathCuerpo = Path().apply {
                moveTo(0f, h * 0.8f)
                lineTo(w * 0.2f, h * 0.2f)
                lineTo(w * 0.4f, h * 0.8f)
                lineTo(w * 0.6f, h * 0.2f)
                lineTo(w * 0.8f, h * 0.8f)
                lineTo(w, h * 0.4f)
            }

            drawPath(
                path = pathCuerpo,
                color = blanco,
                style = Stroke(
                    width = h * 0.15f,
                    cap = StrokeCap.Round,
                    join = StrokeJoin.Round
                )
            )


            drawCircle(color = blanco, radius = h * 0.15f, center = androidx.compose.ui.geometry.Offset(0f, h * 0.8f)) // Orbe en la cola
            drawCircle(color = blanco, radius = h * 0.15f, center = androidx.compose.ui.geometry.Offset(w, h * 0.4f))  // Orbe en la cabeza
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

