package roman.bannikov.androiddevanswers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import roman.bannikov.androiddevanswers.databinding.FragmentThemesBinding

class ThemesFragment : Fragment() {

    private var _binding: FragmentThemesBinding? = null
    private val binding: FragmentThemesBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThemesBinding.inflate(inflater, container, false)

        initButtons()

        return binding.root
    }

    private fun initButtons() = with (binding) {
        btnBasic.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, BasicQuestionsFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }
        btnSOLID.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SolidQuestionsFragment.newInstance())
                .addToBackStack(null)
                .commit()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = ThemesFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}