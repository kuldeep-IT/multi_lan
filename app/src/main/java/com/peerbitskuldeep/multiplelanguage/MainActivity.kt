package com.peerbitskuldeep.multiplelanguage

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myPreference: MyPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setOnClickListener {

            startActivity(Intent(this, Settings::class.java))

        }

    }

    override fun attachBaseContext(newBase: Context?) {

        myPreference = MyPreference(newBase!!)

        var lang: String? = myPreference.getLang()

        super.attachBaseContext(MyContextWrapper.wrap(newBase, lang!!))



    }


}