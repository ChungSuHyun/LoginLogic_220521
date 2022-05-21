package com.nepplus.loginlogic_220521

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

//            버튼이 눌리면 => 입력한 id /pw를 변수로

            val inputID = edtID.text.toString()
            val inputPw = edtPW.text.toString()

//            ID : "admin" / PW : "qwer" 이게 둘다 맞는가? AND로 검사

            if ( inputID == "admin" && inputPw == "qwer") {
//                로그인 성공
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }

            else {
                Toast.makeText(this, "로그인에 실패하셨습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}