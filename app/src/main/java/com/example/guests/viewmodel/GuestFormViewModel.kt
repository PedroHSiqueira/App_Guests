package com.example.guests.viewmodel

import androidx.lifecycle.ViewModel
import com.example.guests.repository.GuestRepository

class GuestFormViewModel : ViewModel() {

    //Instanciando a camada de Repositorio
    private val repository = GuestRepository.getInstance()


}