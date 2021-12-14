package ru.agel.example.shopAndroid.ui.adapter

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ru.agel.example.shopAndroid.model.Cake


class CakeViewModel(application: Application, val cake: Cake) : AndroidViewModel(application){}