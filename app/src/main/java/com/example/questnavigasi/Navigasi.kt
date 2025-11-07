package com.example.questnavigasi

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Beranda,
    Formulir,
    List
}

@Composable
fun HomeApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.Beranda.name) {
                Homepage(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.List.name)
                    }
                )
            }

            composable(route = Navigasi.List.name) {
                DaftarPeserta(
                    onBackToBerandaClick = {
                        cancelAndBackToBeranda(navController)
                    },
                    OnBtnToFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                FormDataDiri(
                    onBackToBtnClick = {
                        cancelAndBackToList(navController)
                    }
                )
            }
        }
    }
}



