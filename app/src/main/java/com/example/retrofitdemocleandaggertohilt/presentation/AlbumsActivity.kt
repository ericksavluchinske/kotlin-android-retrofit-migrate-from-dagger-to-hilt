package com.example.retrofitdemocleandaggertohilt.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitdemocleandaggertohilt.R
import com.example.retrofitdemocleandaggertohilt.databinding.ActivityAlbumsBinding
import com.example.retrofitdemocleandaggertohilt.presentation.album.AlbumsAdapter
import com.example.retrofitdemocleandaggertohilt.presentation.album.AlbumsViewModel
import com.example.retrofitdemocleandaggertohilt.presentation.album.AlbumsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AlbumsActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: AlbumsViewModelFactory
    private lateinit var albumsViewModel: AlbumsViewModel
    private lateinit var binding: ActivityAlbumsBinding
    private lateinit var adapter: AlbumsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_albums)
        albumsViewModel = ViewModelProvider(this, factory)
            .get(AlbumsViewModel::class.java)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.albumsRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = AlbumsAdapter()
        binding.albumsRecyclerView.adapter = adapter
        displayAlbums()
    }

    private fun displayAlbums() {
        binding.albumsProgressBar.visibility = View.VISIBLE
        val responseLiveData = albumsViewModel.getAlbums()
        responseLiveData.observe(this, Observer {
            if (it != null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.albumsProgressBar.visibility = View.GONE
            }else{
                binding.albumsProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available", Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_update, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_update -> {
                updateAlbums()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun updateAlbums(){
        binding.albumsProgressBar.visibility = View.VISIBLE
        val response = albumsViewModel.updateAlbums()
        response.observe(this, Observer {
            if (it != null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.albumsProgressBar.visibility = View.GONE
            }else{
                binding.albumsProgressBar.visibility = View.GONE
            }
        })
    }
}