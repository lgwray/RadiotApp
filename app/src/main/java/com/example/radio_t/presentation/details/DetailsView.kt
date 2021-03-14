package com.example.radio_t.presentation.details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.radio_t.presentation.episodes.Episode

@Composable
fun DetailView(podcastNumber: Long?) {
  if (podcastNumber == null) {
    Text(text = "Error")
  } else {
    PodcastContent(podcastNumber)
  }
}

@Composable
private fun PodcastContent(podcastNumber: Long) {
  val viewModel = viewModel(DetailsViewModel::class.java)
  viewModel.loadPodcast(podcastNumber)
  val podcast by viewModel.podcast.observeAsState()
  podcast?.let {
    Episode(podcast = it)
  }
}