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

@Composable
fun BanderaScreen(modifier: Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (celeste1, blanco, celeste2, sol) = createRefs()
        val gl1 = createGuidelineFromTop(1f / 3f)
        val gl2 = createGuidelineFromTop(2f / 3f)


        Box(Modifier.constrainAs(celeste1) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(gl1)
            width = Dimension.fillToConstraints; height = Dimension.fillToConstraints
        }.background(Color(0xFF74ACDF)))

        Box(Modifier.constrainAs(blanco) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(gl1)
            bottom.linkTo(gl2)
            width = Dimension.fillToConstraints; height = Dimension.fillToConstraints
        }.background(Color.White))

        Box(Modifier.constrainAs(celeste2) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(gl2)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints; height = Dimension.fillToConstraints
        }.background(Color(0xFF74ACDF)))


        Box(Modifier.size(50.dp).clip(CircleShape).background(Color(0xFFF6B40E)).constrainAs(sol) {
            top.linkTo(blanco.top)
            bottom.linkTo(blanco.bottom)
            start.linkTo(blanco.start)
            end.linkTo(blanco.end)
        })
    }
    }




@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

