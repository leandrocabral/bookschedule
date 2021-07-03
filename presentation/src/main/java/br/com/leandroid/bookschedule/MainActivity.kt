package br.com.leandroid.bookschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.leandroid.logger.Logger


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        Logger().error("Hello world!!")

    }
}