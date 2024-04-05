package com.project.registerloginforgot

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.project.registerloginforgot.adapter.RecyclerAdapterWisata
import com.project.registerloginforgot.model.Wisata

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var recyclerAdapterWisata: RecyclerAdapterWisata
    lateinit var dataListWisata : ArrayList<Wisata>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataListWisata = ArrayList()

        val wisata1 = Wisata(R.drawable.wisata, "Wisata Rumah", "Wisata ini bisa dibilang merupakan tempat wisata terpopuler di dalam area Kota Medan. Merupakan istana Kesultanan Deli dan menjadi ikon Kota Medan, istana ini didesain oleh arsitek dari tentara Kerajaan Belanda untuk Sultan Deli.");
        val wisata2 = Wisata(R.drawable.wisata2, "Wisatan Rumput Hijau", "Tjong Yong Hian Gallery adalah sebuah taman yang dibangun oleh Tjong Yong Hian, salah satu pengusaha sukses sekaligus tokoh berpengaruh lainnya di Kota Medan di akhir abad 19.");
        val wisata3 = Wisata(R.drawable.wisata3, "Wisata Indah", "Taman yang disebut juga Taman Kebun Bunga atau Taman Tjong Yong Hian ini diresmikan pada 2011, dan dulunya merupakan rumah dari Tjong Yong Hian. Taman ini pun dibuka sebagai salah satu tempat wisata di Medan, untuk mengenang peran besar Tjong Yong Hian dalam perkembangan kota.");
        val wisata4 = Wisata(R.drawable.wisata4, "Pantai Love", "Keindahan alam yang menakjubkan juga didukung oleh keberagaman ekosistem di sekitarnya, termasuk hutan tropis dan gua-gua alami, membuat pantai ini layak untuk kamu abadikan di dalam album fotomu. Jadi, jangan lupa siapkan kamera terbaikmu, ya, saat datang ke sini.");
        val wisata5 = Wisata(R.drawable.wisata5, "Wisata Bali", "Bali merupakan destinasi wisata sempurna berkat cuacanya yang bagus dan fakta bahwa pulau ini dipenuhi objek wisata menarik dan aktivitas yang tak boleh dilewatkan. Faktanya, mustahil untuk mengunjungi semua tempat wisata terbaik di Bali dalam sekali perjalanan! Namun, Anda bisa saja mengunjungi banyak tempat wisata sekaligus yang jaraknya berdekatan dengan tempat Anda menginap.");
        val wisata6 = Wisata(R.drawable.wisata6, "Wisata Kincir Angin", "Kecamatan Bandungan merupakan sedikit daerah di Semarang yang memiliki potensi wisata menakjubkan. Nah, salah satu spot yang bisa kamu sambangi di kawasan ini adalah Taman Bunga Celosial");
        val wisata7 = Wisata(R.drawable.wisata7, "Candi Borobudur", "Candi Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta.");

        dataListWisata.add(wisata1)
        dataListWisata.add(wisata2)
        dataListWisata.add(wisata3)
        dataListWisata.add(wisata4)
        dataListWisata.add(wisata5)
        dataListWisata.add(wisata6)
        dataListWisata.add(wisata7)

        recyclerView = findViewById(R.id.rv_data);
        recyclerAdapterWisata = RecyclerAdapterWisata(dataListWisata, this@MainActivity)
        recyclerAdapterWisata.setOnclickCallback(object : RecyclerAdapterWisata.OnItemClickCallback {
            override fun onItemClick(item: Wisata?, position: Int) {
                val intent = Intent(this@MainActivity, DetailWisataActivity::class.java)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("desc", item?.desc)
                intent.putExtra("image", item?.image as Int)
                startActivity(intent)
            }
        })
        recyclerView.adapter = recyclerAdapterWisata
    }
}