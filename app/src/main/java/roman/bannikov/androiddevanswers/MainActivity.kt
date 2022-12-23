package roman.bannikov.androiddevanswers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import roman.bannikov.androiddevanswers.databinding.ActivityMainBinding
import roman.bannikov.androiddevanswers.foundation.ActivityScopeViewModel
import roman.bannikov.androiddevanswers.foundation.views.FragmentsHolder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        initBottomNavigationViewSelector()
    }

    private fun initBottomNavigationViewSelector() {
        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item1 -> {
                    //todo
                }
                R.id.item2 -> {
                    //todo
                }
                R.id.item3 -> {
                    //todo
                }
                R.id.item4 -> {
                    //todo
                }
                R.id.item5 -> {
                    //todo
                }
            }
            true
        }
    }

}