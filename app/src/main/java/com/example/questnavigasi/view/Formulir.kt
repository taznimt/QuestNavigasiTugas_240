package com.example.questnavigasi.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasi.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormDataDiri(
    onBackToBtnClick: () -> Unit
) {
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    var textStatus by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }
    var status by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")
    val status1: List<String> = listOf("Janda", "Lajang", "Duda")

    Box(modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFB39DDB))
                    .padding(vertical = 20.dp)
            ){
                Text(
                    text = "Formulir Pendaftaran",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            ElevatedCard(modifier = Modifier
                .fillMaxWidth(1f)
                .padding(all = 10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 50.dp)
            ) {
                Text(text = "NAMA LENGKAP",modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    label = { Text(text = "Isian Nama Lengkap")},
                    modifier = Modifier.padding(10.dp)
                        .fillMaxWidth(1f),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.DarkGray,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedBorderColor = Color.Blue,
                        unfocusedBorderColor = Color.Gray,
                    )
                )

                Text(text = "JENIS KELAMIN",modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                Column() {
                    gender.forEach { item ->
                        Column(
                            modifier = Modifier
                                .selectable(
                                    selected = textJK == item,
                                    onClick = { textJK == item }
                                )
                        ){
                            Row() {
                                RadioButton(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                )
                                Text(
                                    text = item,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }
                    }
                }
                Text(text = "STATUS PERKAWINAN",modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                Column() {
                    status1.forEach { item ->
                        Column(
                            modifier = Modifier
                                .selectable(
                                    selected = textStatus == item,
                                    onClick = {textStatus == item}
                                )
                        ){
                            Row() {
                                RadioButton(
                                    selected = textStatus == item,
                                    onClick = {textStatus = item}
                                )
                                Text(
                                    text = item,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }
                    }
                }
                Text(text = "ALAMAT LENGKAP",modifier = Modifier.padding(all = 10.dp), fontWeight = FontWeight.Bold)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    label = { Text(text = "Alamat Lengkap")},
                    modifier = Modifier.padding(10.dp)
                        .fillMaxWidth(1f),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.DarkGray,
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedBorderColor = Color.Blue,
                        unfocusedBorderColor = Color.Gray,
                    )
                )
                Button(
                    modifier = Modifier
                        .fillMaxWidth(fraction = 1f)
                        .padding(all = 10.dp),
                    onClick = {
                        jenis = textJK
                        status = textStatus
                        onBackToBtnClick()
                    }
                ){
                    Text(text = stringResource(id = R.string.submit))
                }
            }
        }
    }
}