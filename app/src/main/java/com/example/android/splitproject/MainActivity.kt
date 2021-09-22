package com.example.android.splitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.android.splitproject.newspage.News
import com.example.android.splitproject.newspage.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_container_news.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private val viewPagerAdapter = ViewPagerAdapter(
        listOf(
            News(
                "12 Aug, 20 07:23pm",
                "Catch the latest sporting news!",
                "maecenas lorem ullamcorper sagittis, commodo sagittis, lorem",
                R.drawable.newsimage

            ),
            News(
                "12/07/1999, Aug",
                "catch the bird",
                "The largest bird of the world",
                R.drawable.newsimage
            ),
            News(
                "12 Aug, 20 07:23pm",
                "Catch the latest sporting news!",
                "maecenas lorem ullamcorper sagittis, commodo sagittis, lorem",
                R.drawable.newsimage
            ),
            News(
                "12 Aug, 20 07:23pm",
                "Catch the latest sporting news!",
                "maecenas lorem ullamcorper sagittis, commodo sagittis, lorem",
                R.drawable.newsimage
            ),
            News(
                "12/07/1999, Aug",
                "catch the bird",
                "The largest bird of the world",
                R.drawable.newsimage
            )

        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_page_news.adapter= viewPagerAdapter
        view_page_news.orientation= ViewPager2.ORIENTATION_HORIZONTAL
    }
}
