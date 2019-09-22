package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var myName = MyName(name = "Marlon Leng")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myName = myName

        binding.Done.setOnClickListener {
            addNickName(it)
        }
    }

    private fun addNickName(view:View){

        binding.apply {

            myName?.nickName = nicknameEdit.text.toString()

//            binding.nicknameText.text = binding.nicknameEdit.text

            invalidateAll()

            nicknameText.visibility = View.VISIBLE

            nicknameEdit.visibility = View.GONE
            Done.visibility = View.GONE
        }

//        val nickNameEditView: EditText = findViewById(R.id.nickname_edit)
//        val nicknameTextView :TextView = findViewById(R.id.nickname_text)
//
//        nicknameTextView.text = nickNameEditView.text
//        nickNameEditView.visibility = View.GONE
//        view.visibility = View.GONE
//        nicknameTextView.visibility = View.VISIBLE

        val  imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
