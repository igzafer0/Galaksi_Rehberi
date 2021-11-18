package com.info.galaksirehberi.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.info.galaksirehberi.models.BodieModel
import com.info.galaksirehberi.utils.RetrofitInst
import kotlinx.coroutines.launch

class bodieViewModel : ViewModel() {
    private var _bodies = MutableLiveData<BodieModel>()
    val bodies: LiveData<BodieModel>
        get() = _bodies
    fun getData() {
        viewModelScope.launch {
            try {
                _bodies.value = RetrofitInst.retrofitInstance.getBodies()
            } catch (e: Exception) {
                Log.d("winter",e.message.toString())
            }
        }
    }
}