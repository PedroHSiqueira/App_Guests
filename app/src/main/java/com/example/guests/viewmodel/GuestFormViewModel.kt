package com.example.guests.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    //Instanciando a camada de Repositorio
    private val repository = GuestRepository.getInstance(application)


}