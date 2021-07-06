package com.example.appconvidados.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AllGestsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Todos os convidados"
    }
    val text: LiveData<String> = _text
}