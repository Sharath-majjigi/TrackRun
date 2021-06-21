package com.example.trackrun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.trackrun.repositories.MainRepository
import javax.inject.Inject

class StatisticsViewModel@ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel(){

}