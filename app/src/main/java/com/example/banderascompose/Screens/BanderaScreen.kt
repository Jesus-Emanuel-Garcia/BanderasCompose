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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size

import androidx.compose.ui.unit.dp

object ZombieData {
    // Identificadores de la matriz
    private const val O  = 0
    private const val DG = 1
    private const val LG = 2
    private const val NG = 3
    private const val BK = 4
    private const val LB = 5
    private const val DB = 6
    private const val NP = 7
    private const val DP = 8
    private const val GY = 9
    private const val DS = 10

    // Mapeo de IDs a colores de Jetpack Compose
    val colorMap: Map<Int, Color> = mapOf(
        O  to Color.Transparent,
        DG to Color(0xFF2E5D1E),
        LG to Color(0xFF6BB343),
        NG to Color(0xFF417A28),
        BK to Color(0xFF141414),
        LB to Color(0xFF28B4E3),
        DB to Color(0xFF0E729C),
        NP to Color(0xFF283C9D),
        DP to Color(0xFF172368),
        GY to Color(0xFF5A5A5A),
        DS to Color(0xFF3C3C3C)
    )

    val matrix: Array<IntArray> = arrayOf(
        intArrayOf(O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O),

        // Cabeza
        intArrayOf(O,O,O,O, O,O,O,O, DG,DG,DG,DG, DG,DG,DG,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,LG,LG,LG, LG,LG,LG,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,LG,LG,LG, LG,LG,LG,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,BK,BK,LG, LG,BK,BK,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,LG,LG,NG, NG,LG,LG,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,LG,LG,LG, LG,LG,LG,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,LG,LG,LG, LG,LG,LG,DG, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DG,DG,DG,DG, DG,DG,DG,DG, O,O,O,O, O,O,O,O),

        // Brazos y Camiseta (parte superior)
        intArrayOf(O,O,O,O, DG,DG,DG,DG, DB,LB,LB,LB, LB,LB,LB,DB, DG,DG,DG,DG, O,O,O,O),
        intArrayOf(O,O,O,O, DG,LG,LG,DG, DB,LB,LB,LB, LB,LB,LB,DB, DG,LG,LG,DG, O,O,O,O),
        intArrayOf(O,O,O,O, DG,LG,LG,DG, DB,LB,LB,LB, LB,LB,LB,DB, DG,LG,LG,DG, O,O,O,O),
        intArrayOf(O,O,O,O, DG,DG,DG,DG, DB,LB,LB,LB, LB,LB,LB,DB, DG,DG,DG,DG, O,O,O,O),

        // Torso (Camiseta parte inferior)
        intArrayOf(O,O,O,O, O,O,O,O, DB,LB,LB,LB, LB,LB,LB,DB, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DB,LB,LB,LB, LB,LB,LB,DB, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DB,LB,LB,LB, LB,LB,LB,DB, O,O,O,O, O,O,O,O),

        // Pantalones
        intArrayOf(O,O,O,O, O,O,O,O, DP,NP,NP,DP, DP,NP,NP,DP, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DP,NP,NP,DP, DP,NP,NP,DP, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DP,NP,NP,DP, DP,NP,NP,DP, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DP,NP,NP,DP, DP,NP,NP,DP, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, DP,NP,NP,DP, DP,NP,NP,DP, O,O,O,O, O,O,O,O),

        // Zapatos
        intArrayOf(O,O,O,O, O,O,O,O, DS,GY,GY,DS, DS,GY,GY,DS, O,O,O,O, O,O,O,O),
        intArrayOf(O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O, O,O,O,O)
    )
}

@Composable
fun ZombiePixelArtGrid() {

    Column {
        for (row in ZombieData.matrix) {

            Row {
                for (pixelId in row) {
                    val pixelColor = ZombieData.colorMap[pixelId] ?: Color.Transparent

                    Box(
                        modifier = Modifier
                            .size(16.dp)
                            .background(pixelColor)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewZombiePixelArt() {
    ZombiePixelArtGrid()
}

