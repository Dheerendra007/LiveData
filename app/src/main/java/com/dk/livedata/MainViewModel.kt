package com.dk.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    //We can change value
     var mutableLiveData = MutableLiveData<String>("Hello Welcome to Anroid")

    fun updateLiveDate(){
        mutableLiveData.value = "update android to kotlin"
    }
}
