package roman.bannikov.androiddevanswers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import roman.bannikov.androiddevanswers.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ThemesFragment.newInstance()).commit()
        }
    }

}