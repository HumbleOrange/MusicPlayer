package com.harshRajpurohit.musicPlayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.harshRajpurohit.musicPlayer.databinding.ActivityAboutBinding
/*用于显示关于应用程序的信息。使用自动生成的绑定类来绑定布局文件中的视图，并将相关文本设置到对应的TextView视图中。*/
class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "Endless Journey Music Player" +
                "\n\nVersion Name: 2.0.1"+
                "\n\nEmail:8210213107@csu.edu.cn"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\n"+
                "\n\nEndless Journey Music Player 版权所有 " +
                "\n\nCopyright© 2024 Created by xcb & mcl & zfs"
    }
}