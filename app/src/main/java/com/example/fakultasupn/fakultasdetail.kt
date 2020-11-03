package com.example.fakultasupn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_fakultas.*

class fakultasdetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_fakultas)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskF = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskS = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            image_detail.setImageResource(imgF)
            name_detail.text = nameF
            desc_detail.text = deskF
            short_detail.text = deskS
        }
    }

}