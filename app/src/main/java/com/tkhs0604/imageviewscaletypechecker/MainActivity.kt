package com.tkhs0604.imageviewscaletypechecker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ImageView.ScaleType.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.text = imageView1.scaleType.name
        textView2.text = imageView2.scaleType.name

        button1.setOnClickListener {
            switchScaleType(imageView1)
            textView1.text = imageView1.scaleType.name
        }

        button2.setOnClickListener {
            switchScaleType(imageView2)
            textView2.text = imageView2.scaleType.name
        }

    }

    private fun switchScaleType(imageView: ImageView) {
        imageView.scaleType = when (imageView.scaleType) {
            CENTER        -> CENTER_CROP
            CENTER_CROP   -> CENTER_INSIDE
            CENTER_INSIDE -> FIT_CENTER
            FIT_CENTER    -> FIT_END
            FIT_END       -> FIT_START
            FIT_START     -> FIT_XY
            FIT_XY        -> MATRIX
            MATRIX        -> CENTER
            null          -> FIT_CENTER
        }
    }

}
