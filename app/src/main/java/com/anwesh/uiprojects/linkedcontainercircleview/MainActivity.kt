package com.anwesh.uiprojects.linkedcontainercircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.containercirclesview.ContainerCirclesView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ContainerCirclesView.create(this)
    }
}
