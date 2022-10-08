package com.example.agendaapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    fun viewCalendar(view: View?) {
        setContentView(R.layout.activity_calendar);
    }

    fun addEvent(view: View?) {
        setContentView(R.layout.activity_event);
    }



}