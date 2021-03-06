package com.example.appconvidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.appconvidados.service.model.GuestModel
import com.example.appconvidados.service.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val mContext = application.applicationContext
    private val mGuestRepository: GuestRepository = GuestRepository.getInstance(mContext)

    private var mSaveGuest = MutableLiveData<Boolean>()
    val saveGest: LiveData<Boolean> = mSaveGuest

    fun save(name: String, presence: Boolean) {

        val guest = GuestModel(name = name, presence = presence)

        mGuestRepository.save(guest)

    }
}