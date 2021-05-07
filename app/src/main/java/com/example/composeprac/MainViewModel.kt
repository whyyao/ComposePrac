package com.example.composeprac

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.composeprac.model.CardCollection
import com.example.composeprac.networking.PokemonCardsApi
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainViewModel : ViewModel() {

    fun getData() {
        PokemonCardsApi.cardsApi.getAllCards().enqueue(object : Callback,
            retrofit2.Callback<CardCollection> {
            override fun onResponse(
                call: Call<CardCollection>,
                response: Response<CardCollection>
            ) {
                Log.d("here", response.body()?.cards.toString())
            }

            override fun onFailure(call: Call<CardCollection>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}