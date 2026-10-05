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
import androidx.compose.ui.geometry.Offset
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

@Composable
fun BanderaScreen(modifier: Modifier){
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF012169))
    ) {
        val (diagonales, cruzBlancaH, cruzBlancaV, cruzRojaH, cruzRojaV) = createRefs()


        Canvas(modifier = Modifier
            .constrainAs(diagonales) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            val grosorBlanco = size.height * 0.22f
            drawLine(Color.White, Offset(0f, 0f), Offset(size.width, size.height), grosorBlanco)
            drawLine(Color.White, Offset(size.width, 0f), Offset(0f, size.height), grosorBlanco)

        }


        Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.33f).background(Color.White).constrainAs(cruzBlancaV) {
            centerHorizontallyTo(parent); top.linkTo(parent.top); bottom.linkTo(parent.bottom)
        })
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.33f).background(Color.White).constrainAs(cruzBlancaH) {
            centerVerticallyTo(parent); start.linkTo(parent.start); end.linkTo(parent.end)
        })


        Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(0.2f).background(Color(0xFFC8102E)).constrainAs(cruzRojaV) {
            centerHorizontallyTo(parent); top.linkTo(parent.top); bottom.linkTo(parent.bottom)
        })
        Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.2f).background(Color(0xFFC8102E)).constrainAs(cruzRojaH) {
            centerVerticallyTo(parent); start.linkTo(parent.start); end.linkTo(parent.end)
        })
    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

