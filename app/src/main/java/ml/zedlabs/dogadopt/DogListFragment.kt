package ml.zedlabs.dogadopt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import ml.zedlabs.dogadopt.ui.DogList
import ml.zedlabs.dogadopt.ui.theme.DogAdoptTheme

class DogListFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                DogAdoptTheme{
                    Surface(color = MaterialTheme.colors.background) {
                        DogList(findNavController())
                    }
                }

            }
        }
    }
}