package dev.pegasus.debounceclicksdemo

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import dev.pegasus.debounceclicksdemo.databinding.ActivityMainBinding
import dev.pegasus.debounceclicksdemo.helper.listeners.DebounceListener.setDebounceClickListener
import dev.pegasus.debounceclicksdemo.helper.listeners.DebounceListener.setDebounceMenuItemClickListener
import dev.pegasus.debounceclicksdemo.helper.listeners.DebounceListener.setDebounceNavigationClickListener
import dev.pegasus.debounceclicksdemo.helper.utils.GeneralUtils.showSnackBar

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.activityRef = this

        binding.toolbarMain.setDebounceNavigationClickListener { onClick("Menu Clicked") }
        binding.toolbarMain.setDebounceMenuItemClickListener { onMenuItemClick(it) }
        binding.btnClickMain.setDebounceClickListener { onClick("You are touching the button") }
    }

    fun onClick(msg: String) {
        showSnackBar(binding.root, msg)
    }

    private fun onMenuItemClick(menuItem: MenuItem?) {
        menuItem?.let {
            if (it.itemId == R.id.menu_item_exit)
                showSnackBar(binding.root, "Exiting App in 1 light year")
        }
    }
}