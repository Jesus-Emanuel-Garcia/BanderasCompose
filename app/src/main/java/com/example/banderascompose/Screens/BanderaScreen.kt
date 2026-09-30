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


        ConstraintLayout(modifier=modifier) {
            val (c1,c2,c3) = createRefs()
            val lineaG = createGuidelineFromStart(0.33f)
            val lineaG2 = createGuidelineFromStart(0.66f)



            Box(modifier = Modifier
                .background(Color.Green)
                .constrainAs(c1) {
                    linkTo(parent.start, lineaG)
                    linkTo(parent.top, parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                })

            Box(modifier = Modifier
                    .background(Color.White)
                    .constrainAs(c2) {
                        linkTo(lineaG, lineaG2)
                        linkTo(parent.top, parent.bottom)
                        height = Dimension.fillToConstraints
                        width = Dimension.fillToConstraints
                    }, contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(R.drawable.descargar),
                    contentDescription = "aguila_de_mexico",
                    modifier = Modifier
                        .size(120.dp)
                        .fillMaxSize()
                )
            }
            Box(modifier = Modifier.background(Color.Red).constrainAs(c3){
                linkTo(lineaG2, parent.end)
                linkTo(parent.top,parent.bottom)
                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            })



        }











}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

