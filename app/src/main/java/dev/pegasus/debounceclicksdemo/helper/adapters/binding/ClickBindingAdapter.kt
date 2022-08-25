package dev.pegasus.debounceclicksdemo.helper.adapters.binding

import android.view.View
import androidx.databinding.BindingAdapter
import dev.pegasus.debounceclicksdemo.helper.listeners.DebounceListener.setDebounceClickListener

@BindingAdapter(value = ["debounceClick"], requireAll = false)
fun setDebouncedClick(view: View, debounceClick: () -> Unit) {
    view.setDebounceClickListener {
        debounceClick.invoke()
    }
}