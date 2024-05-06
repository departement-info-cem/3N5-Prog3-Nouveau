package org.depinfo.demorecyclerviewcontexte

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.depinfo.demorecyclerviewcontexte.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

    }
}