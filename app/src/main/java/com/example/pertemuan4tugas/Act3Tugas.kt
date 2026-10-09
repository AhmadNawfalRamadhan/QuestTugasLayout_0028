package com.example.pertemuan4tugas

import androidx.annotation.DimenRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

// Konversi dimen (sp) dari resources menjadi TextUnit
@Composable
private fun spResource(@DimenRes id: Int): TextUnit = dimensionResource(id).value.sp