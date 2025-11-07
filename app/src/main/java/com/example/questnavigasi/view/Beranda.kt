package com.example.questnavigasi.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
    OnSubmitBtnClick:()-> Unit
){
    Scaffold { isiRuang->
        val jihoon = painterResource(R.drawable.jihoon)
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF9EDFC))
                .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text= stringResource(id = R.string.welcome), modifier = Modifier,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                fontSize = 40.sp,
                color = Color(0xFFAD6FBF)
            )
            Spacer(modifier = Modifier.height(height = 30.dp))
            Image(painter=jihoon,
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(height = 30.dp))
            Text(text = stringResource(id=R.string.Nama),
                modifier = Modifier,
                fontSize = 22.sp,
                fontFamily = FontFamily.Monospace,
                color = Color(0xFFAD6FBF)
            )
            Text(text=stringResource(id=R.string.NIM), modifier = Modifier,
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif,
                color=Color.Black
            )
            Spacer(modifier = Modifier.height(height = 30.dp))
            Button(modifier= Modifier
                .width(width = 270.dp),
                onClick = OnSubmitBtnClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFAD6FBF)
                )
            ){
                Text(text = stringResource(id=R.string.submit), modifier = Modifier,
                    color=Color.White)
            }
        }
    }
}