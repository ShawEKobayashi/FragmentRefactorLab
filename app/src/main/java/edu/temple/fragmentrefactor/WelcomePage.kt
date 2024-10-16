package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 * Use the [WelcomePage.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomePage : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome_page, container, false).apply {
            val displayTextView = findViewById<TextView>(R.id.textView)
            val nameEditText = findViewById<EditText>(R.id.editTextText)
            val changeButton = findViewById<Button>(R.id.button)

            changeButton.setOnClickListener {
                val name = nameEditText.text

                displayTextView.text = if (name.isNotBlank()) {
                    "Hello, $name!"
                } else {
                    "Please enter your name"
                }

            }
        }
    }
}
