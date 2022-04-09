package com.example.pt3_boutikar.ui.feeling

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SleepViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Sleep Fragment"
    }
    val text: LiveData<String> = _text
}