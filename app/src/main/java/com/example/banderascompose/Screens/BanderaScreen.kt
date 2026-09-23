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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banderascompose.R

@Composable
fun BanderaScreen(modifier: Modifier){
    Column(modifier = modifier){
        Row(modifier = Modifier.fillMaxWidth().weight(2f).background(colorResource(id = R.color.ArilloColombia))){

        }
        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(colorResource(id = R.color.Azul))){

        }
        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(colorResource(id = R.color.rojo))){

        }
    }

}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    BanderaScreen(modifier = Modifier)

}

