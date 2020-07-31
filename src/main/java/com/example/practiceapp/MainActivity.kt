package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행했을 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결한다.

        tv_title.setText("Hello, World!") // 텍스트의 값을 변경한다.

        btn_getText.setOnClickListener {// 에딧 텍스트에 입력되어있는 값을 가지고오서 텍스트뷰에 뿌려준다.
            var resultText = et_id.text.toString() // 에딧텍스트에 입력되어있는 값
            tv_title.setText(resultText) // 입력된 값을 텍스트위에 set 해줌.
        }
    }
}