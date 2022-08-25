package dev.pegasus.debounceclicksdemo.helper.utils

import android.view.View
import com.google.android.material.snackbar.Snackbar

object GeneralUtils {

    fun showSnackBar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

}