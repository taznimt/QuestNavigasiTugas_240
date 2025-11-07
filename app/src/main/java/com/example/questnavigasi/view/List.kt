package com.example.questnavigasi.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarPeserta(
    onBackToBerandaClick:()-> Unit,
    OnBtnToFormulirClick:()-> Unit
){
    val daftar=listOf(
        Pair(first = stringResource(id=R.string.nama_lengkap), second = "Nana"),
        Pair(first = stringResource(id=R.string.jenis_kelamin), second = "Perempuan"),
        Pair(first = stringResource(id=R.string.status), second = "Lajang"),
        Pair(first = stringResource(id=R.string.alamat), second = "Bantul"),
    )
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text=stringResource(id=R.string.list),color= Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFFD8B4FE))
            )
        }
    ){ isiRuang->
        Column (modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF9EDFC))
            .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top)

        {
            daftar.forEach { item->
                Card (modifier = Modifier
                    .padding(all=12.dp)
                    .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White)
                )
                {
                    Column (modifier = Modifier
                        .padding(all=15.dp)){
                        Text(text=item.first,
                            fontSize = 16.sp

                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(text=item.second,
                            fontSize = 22.sp,
                            fontFamily = FontFamily.Cursive
                        )
                    }
                }
            }
            Spacer(modifier = Modifier .height(height = 30.dp))
            Button(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id=R.color.purple_500 )
                ),
                onClick = onBackToBerandaClick)
            {
                Text(text="Beranda")
            }
            Button(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id=R.color.purple_500 )
                ),
                onClick = OnBtnToFormulirClick)

            {
                Text(text = stringResource(R.string.formulir))
            }

        }

    }

}