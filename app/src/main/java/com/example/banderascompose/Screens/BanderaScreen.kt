package com.example.banderascompose.Screens

import android.media.Image
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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

@Composable
fun BanderaScreen(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (stripe1, stripe2, stripe3, stripe4, stripe5, triangleGroup) = createRefs()

        val stripeHeight = 0.2f // 5 franjas = 20% cada una[cite: 1]

        // 5 Franjas encadenadas
        Box(Modifier.fillMaxWidth().fillMaxHeight(stripeHeight).background(Color(0xFF002E6E)).constrainAs(stripe1) { top.linkTo(parent.top) })
        Box(Modifier.fillMaxWidth().fillMaxHeight(stripeHeight).background(Color.White).constrainAs(stripe2) { top.linkTo(stripe1.bottom) })
        Box(Modifier.fillMaxWidth().fillMaxHeight(stripeHeight).background(Color(0xFF002E6E)).constrainAs(stripe3) { top.linkTo(stripe2.bottom) })
        Box(Modifier.fillMaxWidth().fillMaxHeight(stripeHeight).background(Color.White).constrainAs(stripe4) { top.linkTo(stripe3.bottom) })
        Box(Modifier.fillMaxWidth().fillMaxHeight(stripeHeight).background(Color(0xFF002E6E)).constrainAs(stripe5) { top.linkTo(stripe4.bottom) })

        // Triángulo y estrella anclados al lado izquierdo
        Canvas(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.45f)
            .constrainAs(triangleGroup) {
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }) {

            // Triángulo[cite: 1]
            val trianglePath = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(trianglePath, color = Color(0xFFCB1428))

            // Nota: Aquí se agregaría la lógica de la estrella (GenericShape)
            // centrada en el centroide del triángulo como lo solicita el manual[cite: 1].
        }
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

