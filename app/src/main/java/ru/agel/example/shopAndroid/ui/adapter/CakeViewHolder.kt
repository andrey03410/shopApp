package ru.agel.example.shopAndroid.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import ru.agel.example.shopAndroid.R
import ru.agel.example.shopAndroid.BR
import ru.agel.example.shopAndroid.databinding.ItemCakeVhBinding
import com.squareup.picasso.Picasso


internal class CakeViewHolder(private val binding: ItemCakeVhBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(cake: CakeViewModel){
        binding.apply {
            setVariable(BR.viewModel, cake)
            cakeName.text = "${cake.cake.name.toString()}"
            cakePrice.text = "Цена: ${cake.cake.price.toString()} рублей"
            cakeWeight.text = "Вес: ${cake.cake.weight.toString()} гр."
            cakeCalories.text = "Калорийность: ${cake.cake.calories.toString()} ккал(100гр)."
            Picasso.get()
                .load("http://192.168.0.100:8080/${cake.cake.image}")
                .placeholder(R.drawable.no_image)
                .error(R.drawable.no_image)
                .into(cakeImg)
        }
    }
}