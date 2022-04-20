package com.example.learningnavigation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.learningnavigation.R
import com.example.learningnavigation.databinding.FragmentCustom1Binding
import com.example.learningnavigation.databinding.FragmentGalleryBinding

class Custom1Fragment : Fragment() {

    companion object {
        val BUNDLE_GALLERY_INFO = "gallery info"
    }

    private var _binding: FragmentCustom1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentCustom1Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textView2
        textView.text = "This is the Custom 1 Fragment"

        binding.buttonGallary.setOnClickListener{
            // with Bundle
            val bundle = Bundle()
            bundle.putString(BUNDLE_GALLERY_INFO,"Greetings from Custom1")
            // without bundle, just add ir as a parameter
            root.findNavController().navigate(R.id.action_nav_custom1_to_nav_gallery, bundle)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}