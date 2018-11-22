package com.example.logonrmlocal.demopersistencia

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import com.example.logonrmlocal.demopersistencia.dao.BancoDeDados
import com.example.logonrmlocal.demopersistencia.model.Game

class ListaViewModel(application: Application): AndroidViewModel(application){

    private val bd = BancoDeDados.getDatabase(application.applicationContext)

    var games: LiveData<List<Game>>? = null

    fun carregaGames(){
        games = bd?.gameDAO()?.lerGames()
    }
}