package com.shvants.dialogfragment_viewbinding_sample

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.fragment.app.DialogFragment

abstract class BaseDialog : DialogFragment() {

    @get:LayoutRes
    abstract val layoutId: Int

    private var textView: TextView? = null
    private var primaryButton: Button? = null
    private var secondaryButton: Button? = null


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog =  super.onCreateDialog(savedInstanceState)

        with(dialog) {
            setContentView(getContentView())

            window?.apply {
                textView = decorView.findViewById(R.id.textView)
                primaryButton = decorView.findViewById(R.id.primaryButton)
                secondaryButton = decorView.findViewById(R.id.secondaryButton)

                initDialog(decorView, savedInstanceState)
            }

        }

        return dialog
    }

    private fun getContentView(): View {
        return LayoutInflater.from(context).inflate(layoutId, null, false)
    }

    abstract fun initDialog(view: View, savedInstanceState: Bundle?)
}