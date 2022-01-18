package jinyoung.dev.walking.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

import dagger.hilt.android.AndroidEntryPoint
import jinyoung.dev.walking.R
import jinyoung.dev.walking.viewmodels.StatisticsViewModel

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}