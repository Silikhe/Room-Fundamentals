package ps.room.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(MainActivity.TAG, "Owner ON_CREATE ")

        lifecycle.addObserver(MainActivityObserver())
    }

    companion object{
        private val TAG : String = MainActivity::class.java.simpleName
    }
}