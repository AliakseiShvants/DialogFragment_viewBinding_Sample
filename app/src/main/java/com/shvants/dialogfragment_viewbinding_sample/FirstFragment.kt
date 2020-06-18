package com.shvants.dialogfragment_viewbinding_sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shvants.dialogfragment_viewbinding_sample.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private val binding: FragmentFirstBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
//            val transaction = parentFragmentManager.beginTransaction()
            val dialog = CustomDialogFragment()

            dialog.show(parentFragmentManager, "CustomDialogFragment")

        }
    }
}