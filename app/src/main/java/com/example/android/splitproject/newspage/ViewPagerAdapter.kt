package com.example.android.splitproject.newspage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.splitproject.R

class ViewPagerAdapter(private val ViewPage: List<News>):
    RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {
    inner class Pager2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val itemDate= itemView.findViewById<TextView>(R.id.news_date)
        private val itemHeadline = itemView.findViewById<TextView>(R.id.news_headline)
        private val itemContent = itemView.findViewById<TextView>(R.id.news_content)
        private val itemImage = itemView.findViewById<ImageView>(R.id.news_image)

        fun bind(news: News){
            itemDate.text= news.date
            itemHeadline.text = news.headlines
            itemContent.text = news.content
            itemImage.setImageResource(news.image)
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Pager2ViewHolder {
       return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_container_news, parent, false))
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.bind(ViewPage[position])
    }

    override fun getItemCount(): Int {
        return ViewPage.size
    }
}