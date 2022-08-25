package com.saitawngpha.taichecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.saitawngpha.tailangchecker.TaiLangChecker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        println("###! ${TaiLangChecker.taiLangChecker("ႁဝ်းပဵၼ်")}")
        checkBtn.setOnClickListener {
            //click button
            checkText()
        }
    }

    private fun checkText(){
        //check function
        val text = inputTxt.text.toString()
        if(!text.isEmpty()){
            //check the input text is not empty
            when(TaiLangChecker.taiLangChecker(text)) {
                //check if input text is true or false
                true -> {showTxt.text = "ပဵၼ်ၽႃသႃလိၵ်ႈတႆးၶႃႈ 😀"}
                false -> {showTxt.text = "ဢမ်ႇၸႂ်ႈၽႃသႃလိၵ်ႈတႆးၶႃႈ 😡"}
            }
        }else{
            //input text is empty
            Toast.makeText(this, "ၶႅၼ်းတေႃႈတႅမ်ႈလိၵ်ႈယဝ်ႉ ၸင်ႇတေထတ်းတူၺ်းၶႃႈ…!", Toast.LENGTH_SHORT).show()
        }
    }
}