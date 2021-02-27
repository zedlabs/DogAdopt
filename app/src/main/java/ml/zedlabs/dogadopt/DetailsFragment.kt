package ml.zedlabs.dogadopt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import ml.zedlabs.dogadopt.ui.DogDetails

class DetailsFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val dog = arguments?.get("dog") as Dog?

        return ComposeView(requireContext()).apply {
            setContent {
                DogDetails(dog = dog!!)
            }
        }
    }
}