//package com.example.instaclone.fragments
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.example.instaclone.R
//
//
//class HomeFragment : Fragment() {
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
//    }
//
//
//}
package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.*
import com.example.instaclone.adapter.InstaPostAdapter
import com.example.instaclone.adapter.StoriesAdapter
import com.example.instaclone.dataclasses.InstaPost
import com.example.instaclone.dataclasses.Story
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.setSupportActionBar(toolbarHome)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayShowTitleEnabled(false)
        setHasOptionsMenu(true)
        showStories()
        showPosts()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.home_top_menu,menu)
    }

    fun showStories(){
        val storiesList=ArrayList<Story>()
        storiesList.add(Story("https://thumbs.dreamstime.com/b/christmas-funny-small-kids-santa-claus-clothes-twins-boy-girl-36248226.jpg","Valary"))
        storiesList.add(Story("https://i.pinimg.com/originals/87/87/31/8787318968c9dde01471cf54006ef6f4.jpg","Wendy"))
        storiesList.add(Story("https://img5.cfcdn.club/e3/76/e33af51272b88cad7dcfbf80c3073b76_350x350.jpg","Juliana"))
        storiesList.add(Story("https://ae01.alicdn.com/kf/HTB17wF9OVXXXXcyaXXXq6xXFXXXk/Baby-Photo-Props-Rabbit-Cartoon-Knitted-Baby-Winter-Hat-Warm-Ears-Protect-Crochet-Gorro-Infantil-Cap.jpg","Joy"))
        storiesList.add(Story("https://thumbs.dreamstime.com/b/christmas-funny-small-kids-santa-claus-clothes-twins-boy-girl-36248226.jpg","Uhuru"))
        storiesList.add(Story("https://images-eu.ssl-images-amazon.com/images/I/51E3bTvhhTL.jpg","Stephanie"))
        storiesList.add(Story("https://i.pinimg.com/564x/5b/62/39/5b6239d6859d685f73cbfe72871a7ad6.jpg","Consolata"))
        storiesList.add(Story("https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg","Akinyi"))
        storiesList.add(Story("https://images-eu.ssl-images-amazon.com/images/I/51E3bTvhhTL.jpg","Stephanie"))
        storiesList.add(Story("https://i.pinimg.com/564x/5b/62/39/5b6239d6859d685f73cbfe72871a7ad6.jpg","Consolata"))
        storiesList.add(Story("https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg","Akinyi"))

        val storiesAdapter= StoriesAdapter(storiesList)
        rvStories.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvStories.adapter=storiesAdapter
    }

    fun showPosts(){
        val instaPostList=ArrayList<InstaPost>()
        instaPostList.add(
            InstaPost("https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg","uhuru_akinyi","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Hey there ,I am using Instagram")
        )
        instaPostList.add(
            InstaPost("https://i.pinimg.com/564x/5b/62/39/5b6239d6859d685f73cbfe72871a7ad6.jpg","Jujuswiry","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Hey there ,I am using Instagram")
        )
        instaPostList.add(
            InstaPost("https://images-eu.ssl-images-amazon.com/images/I/51E3bTvhhTL.jpg","wendy_orengo","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Hey there ,I am using Instagram")
        )
        instaPostList.add(
            InstaPost("https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg","valary_akinyi","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Hey there ,I am using Instagram")
        )
        instaPostList.add(
            InstaPost("https://thumbs.dreamstime.com/b/christmas-funny-small-kids-santa-claus-clothes-twins-boy-girl-36248226.jpg","Uhuru","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Hey there ,I am using Instagram")
        )
        instaPostList.add(
            InstaPost("https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg","a_kinyi","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"If you don't want to do something right don't even start it")
        )
        instaPostList.add(
            InstaPost("https://img5.cfcdn.club/e3/76/e33af51272b88cad7dcfbf80c3073b76_350x350.jpg","joy_kamuren","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Your tomorrow must be greater than today")
        )
        instaPostList.add(
            InstaPost("https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg","judith_tollah","https://i.pinimg.com/564x/6c/ba/67/6cba67adcfefacf5a5b2550c2553ad1d.jpg",
                342,"Hey hey hey.Wake up,pray and slay")
        )

        val instaPostAdapter= InstaPostAdapter(instaPostList)
        rvPosts.layoutManager=LinearLayoutManager(context)
        rvPosts.adapter=instaPostAdapter
    }
}
