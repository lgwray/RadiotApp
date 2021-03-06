package com.stelmashchuk.remark.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FullSizeProgress() {
  Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
    CircularProgressIndicator()
  }
}
