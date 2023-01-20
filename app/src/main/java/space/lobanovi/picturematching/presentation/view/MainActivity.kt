package space.lobanovi.picturematching.presentation.view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.jinatonic.confetti.CommonConfetti
import space.lobanovi.picturematching.R
import space.lobanovi.picturematching.databinding.ActivityMainBinding
import space.lobanovi.picturematching.presentation.pecenter.EmojiGame

class MainActivity: AppCompatActivity() {

    private lateinit var ui : ActivityMainBinding
    private lateinit var numberGame: EmojiGame
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        initialize()

    }

    private fun initialize() {
        ui.rvMain.adapter = EmojiAdapter()
    }
}