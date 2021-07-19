package com.peerbitskuldeep.multiplelanguage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {

    var languageList = arrayOf("en","es")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        var myPref = MyPreference(this)

        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languageList)

        val lang = myPref.getLang()
        val index = languageList.indexOf(lang)

        if (index >= 0)
        {
            spinner.setSelection(index)
        }

        button.setOnClickListener {

            myPref.setPrefLang(languageList[spinner.selectedItemPosition])
            startActivity(Intent(this,MainActivity::class.java))
            finish()

        }

    }
}