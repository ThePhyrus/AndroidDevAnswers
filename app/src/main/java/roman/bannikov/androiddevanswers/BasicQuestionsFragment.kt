package roman.bannikov.androiddevanswers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import roman.bannikov.androiddevanswers.databinding.FragmentBasicQuestionsBinding

class BasicQuestionsFragment : Fragment() {

    private var _binding: FragmentBasicQuestionsBinding? = null
    private val binding: FragmentBasicQuestionsBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicQuestionsBinding.inflate(inflater, container, false)

        initButtons()

        return binding.root
    }

    private fun initButtons() = with(binding) {
        btnOOPPrinciples.setOnClickListener {
            tvAnswer.text = getString(R.string.oop_principles)
        }
        btnWhatIsEncapsulation.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_encapsulation)
        }
        btnWhatIsInheritance.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_inheritance)
        }
        btnWhatIsPolymorphism.setOnClickListener {
            tvAnswer.text = getString(R.string.polymorphism)
        }
        btnWhatIsClass.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_class)
        }
        btnWhatIsConstructor.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_constructor)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = BasicQuestionsFragment()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}