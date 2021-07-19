package com.peerbitskuldeep.multiplelanguage

import android.content.Context

class MyPreference(context: Context)
{
    val myPreference = context.getSharedPreferences("MY_SHARED_PREF",Context.MODE_PRIVATE)

    fun setPrefLang(language: String)
    {

        myPreference.edit().putString("LANGUAGE",language).apply()

    }

    fun getLang(): String?
    {
        return myPreference.getString("LANGUAGE","en")
    }

}