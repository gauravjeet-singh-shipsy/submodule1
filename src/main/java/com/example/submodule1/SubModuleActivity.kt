package com.example.submodule1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SubModuleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_module)
        //Hi from App 2
    }
}
