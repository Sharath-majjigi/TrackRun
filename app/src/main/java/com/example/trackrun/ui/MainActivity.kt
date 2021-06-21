package com.example.trackrun.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trackrun.R
import com.example.trackrun.db.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var runDao: RunDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}