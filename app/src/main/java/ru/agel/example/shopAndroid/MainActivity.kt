package ru.agel.example.shopAndroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.agel.example.shopAndroid.ui.cakes.CakesFragment
import ru.agel.example.shopAndroid.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        supportFragmentManager.beginTransaction().replace(R.id.full_content, CakesFragment()).commit()
    }
}