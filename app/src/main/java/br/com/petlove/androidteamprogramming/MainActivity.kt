package br.com.petlove.androidteamprogramming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.petlove.androidteamprogramming.navigation.FragmentA

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(android.R.id.content, FragmentA())
            .commit()
    }
}