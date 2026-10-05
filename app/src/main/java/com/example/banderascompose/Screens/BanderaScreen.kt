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
        val canton = createRef()


        val lineaG = (0..13).map { createGuidelineFromTop(it / 13f) }


        for (i in 0 until 13) {
            val lineaGREF = createRef()
            Box(Modifier.constrainAs(lineaGREF) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(lineaG[i])
                bottom.linkTo(lineaG[i + 1])
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }.background(if (i % 2 == 0) Color(0xFFB22234) else Color.White))
        }


        Box(Modifier.constrainAs(canton) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)

            width = Dimension.percent(0.4f)
            height = Dimension.percent(0.54f)
        }.background(Color(0xFF3C3B6E)))

    }


}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier.fillMaxSize())

}

