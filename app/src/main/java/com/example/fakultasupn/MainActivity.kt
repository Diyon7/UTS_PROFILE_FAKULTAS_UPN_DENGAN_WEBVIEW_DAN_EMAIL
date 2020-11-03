package com.example.fakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        list_main.layoutManager = LinearLayoutManager(this)
        list_main.setHasFixedSize(true)
        list_main.adapter = fakultasadapter(data, { onItem: fakultasdata ->
            onItemClicked(onItem)
        })
    }
    private fun  onItemClicked(onItem: fakultasdata) {
        val showDetailActivityIntent = Intent(this, fakultasdetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.namaFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.deskFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.deskDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<fakultasdata> {
        val rvList = ArrayList<fakultasdata>()
        rvList.add(
            fakultasdata(
                R.drawable.logo__1_,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer\n" +
                        "adalah satu dari dari 7\n" +
                        "program studi di UPN\n" +
                        "VETERAN JATIM",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        rvList.add(
            fakultasdata(
                R.drawable.logo__1_,
                "Fakultas Teknik",
                "Fakultas Teknik\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        rvList.add(
            fakultasdata(
                R.drawable.logo__1_,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        rvList.add(
            fakultasdata(
                R.drawable.logo__1_,
                "Fakultas Pertanian",
                "Fakultas Pertanian\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi: ",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        rvList.add(
            fakultasdata(
                R.drawable.foto_pribadi,
                "Data Profil Saya",
                "Nama : Muhamad Frendi Diyon Ardiansah\n"+
                        "Tempat, Tanggal Lahir : Mojokerto, 09 Juni 1999\n"+
                        "Alamat : Dsn. Ngambar RT:18 RW:05 Ds. Bambe Kec. Driyorejo Kab. Gresik\n"+
                        "No. Telepon : 081615341867\n"+
                        "Email : 18082010037@student.upnjatim.ac.id\n"+
                        "Github : https://github.com/Diyon7\n",
                "Riwayat Pendidikan : \n"+
                        "\t\t 1. SDN 3 Bambe \n"+
                        "\t\t 2. SMPN 2 Krian \n"+
                        "\t\t 3. SMKN 1 Driyorejo \n\n"+
                        "Penghargaan : Belum"
            )
        )
        return rvList
    }
}