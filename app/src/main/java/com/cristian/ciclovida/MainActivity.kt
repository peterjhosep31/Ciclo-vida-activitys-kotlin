package com.cristian.ciclovida
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("crear", "Ingresa a onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("iniciar", "Ingresa a onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("resumir", "Ingresa a onResume()")
    }

    override fun onPause() {
           super.onPause()
           Log.i("pausar", "Ingresa a onPause()")
    }

    override fun onStop() {
           super.onStop()
           Log.i("parar", "Ingresa a onStop()")
    }


    override fun onRestart() {
           super.onRestart()
           Log.i("reiniciar", "Ingresa a onRestart()")
    }

    override fun onDestroy() {
           super.onDestroy()
           Log.i("destruir", "Ingresa a onDestroy()")
    }
}

