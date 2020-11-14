package kr.co.tjoeun.jickbangcopy_20201101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        로딩이 끝나면 (2.5초 정도 후에) => 메인화면으로 이동 => 로딩화면 종료.
        
//        푸시 테스트용 주석

        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({
//            myHandler에게 이 중괄호 내부의 일을 해달라고 요청(할일을 등록 - post)
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }, 2500)



    }

}