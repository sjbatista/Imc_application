package br.com.salosoftwares.mobile.imc_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //finish() = Encerra a aplicação
    }
    override fun onStart() {
        super.onStart()
        Log.w("LifeCycle","START- Iniciado, a tela está visível")
    }

    override fun onResume() {
        super.onResume()
        Log.w("LifeCycle","RESUME- Interagindo rsrs")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LifeCycle","PAUSE- A tela perdeu o foco, não é possível interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("LifeCycle","STOP- A tela não está mais visível, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LifeCycle","RESTART- Retomando o Foco !")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("LifeCycle","GAME OVER")
    }
}