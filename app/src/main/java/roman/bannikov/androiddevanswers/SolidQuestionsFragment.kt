package roman.bannikov.androiddevanswers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import roman.bannikov.androiddevanswers.databinding.FragmentBasicQuestionsBinding
import roman.bannikov.androiddevanswers.databinding.FragmentSolidQuestionsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SolidQuestionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SolidQuestionsFragment : Fragment() {

    private var _binding: FragmentSolidQuestionsBinding? = null
    private val binding: FragmentSolidQuestionsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSolidQuestionsBinding.inflate(inflater, container, false)

        initButtons()

        return binding.root
    }

    private fun initButtons() = with(binding) {
        btnWhatIsSolid.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_solid)
        }
        btnWhatIsSingleResponsibilityPrinciple.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_single_responsibility_principle)
        }
        btnWhatIsOpenClosedPrinciple.setOnClickListener {
            tvAnswer.text = getString(R.string.what_is_open_closed_principle)
        }
        btnWhatIsLiskovSubstitutionPrinciple.setOnClickListener {

        }
        btnWhatIsInterfaceSegregationPrinciple.setOnClickListener {

        }
        btnWhatIsDependencyInversionPrinciple.setOnClickListener {

        }

    }

    companion object {

        @JvmStatic
        fun newInstance() = SolidQuestionsFragment ()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}