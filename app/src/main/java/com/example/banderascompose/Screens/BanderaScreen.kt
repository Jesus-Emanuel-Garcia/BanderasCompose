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

@Composable
fun BanderaScreen(modifier: Modifier){
    ConstraintLayout(

        modifier = modifier.width(240.dp).height(290.dp)
    ) {
        val (pennantSup, pennantInf) = createRefs()
        val mitad = createGuidelineFromTop(0.5f)


        Canvas(modifier = Modifier.constrainAs(pennantSup) {
            top.linkTo(parent.top)
            bottom.linkTo(mitad)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }) {
            val triangSuperior = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width * 0.92f, size.height * 0.80f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(triangSuperior, color = Color(0xFF003893))
        }


        Canvas(modifier = Modifier.constrainAs(pennantInf) {
            top.linkTo(mitad)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }) {
            val triangInferior = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width * 0.92f, size.height * 0.40f) // Solapa sutilmente arriba[cite: 1]
                lineTo(0f, size.height)
                close()
            }
            drawPath(triangInferior, color = Color(0xFF003893))

        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

