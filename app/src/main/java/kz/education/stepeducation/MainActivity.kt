package kz.education.stepeducation

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    var buttonAction: Button? = null
    var textviewStatus: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    fun initializeViews(){
        buttonAction = findViewById(R.id.button_activity_main_action)
        textviewStatus = findViewById(R.id.textview_activity_main_status)
    }

    fun initializeListeners(){
        buttonAction!!.setOnClickListener(View.OnClickListener {
            textviewStatus!!.setText(getString(R.string.acitvity_main_textview_status_pressed))
            textviewStatus!!.setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
        })
    }
}
