package com.example.guests.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel(application: Application): AndroidViewModel(application) {
    private val repository = GuestRepository.getInstance(application)
}