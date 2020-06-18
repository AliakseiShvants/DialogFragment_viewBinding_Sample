package com.shvants.dialogfragment_viewbinding_sample

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.shvants.dialogfragment_viewbinding_sample.databinding.CustomDialogFragmentBinding

class CustomDialogFragment : BaseDialog() {

    override val layoutId: Int = R.layout.custom_dialog_fragment

    private val binding: CustomDialogFragmentBinding by viewBinding()

    override fun initDialog(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {
        with(binding) {
            textView.text = "Please click button!"
            textView.visibility = View.VISIBLE

            secondaryButton.text = "Cancel"
            secondaryButton.visibility = View.VISIBLE
            secondaryButton.setOnClickListener {
                textView.text = ""
                dismiss()
            }

            primaryButton.text = "OK"
            primaryButton.visibility = View.VISIBLE
            primaryButton.setOnClickListener {
                textView.text = "You have choosen the right way!"
            }
        }
    }
}