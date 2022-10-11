package kr.ac.kumoh.s20190703.prof.w0501carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20190703.prof.w0501carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding //레이아웃 XML 파일의 이름을 파스칼 케이스로 쓰고 뒤에 Binding 붙이면 클래스 이름이 됨
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)//기존 12 라인의 setContentView()를 13~14라인으로 변경
        setContentView(binding.root)

        binding.card1.setImageResource(R.drawable.c_2_of_hearts) //이미지뷰에 리소스 지정하는 소스 추가
    }
}