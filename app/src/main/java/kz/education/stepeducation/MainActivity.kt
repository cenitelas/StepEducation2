package kz.education.stepeducation

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    var buttonLogon: Button? = null
    var buttonHideView: Button? = null;
    var textviewStatus: TextView? = null
    var edittextLogin: EditText? = null;
    var edittextPassword: EditText? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    fun initializeViews(){
        buttonLogon = findViewById(R.id.button_activity_main_logon)
        buttonHideView = findViewById(R.id.button_activity_main_hide_view)
        textviewStatus = findViewById(R.id.textview_activity_main_status)
        edittextLogin = findViewById(R.id.edittview_activity_main_login)
        edittextPassword = findViewById(R.id.edittview_activity_main_password)
    }

    fun initializeListeners(){
        buttonLogon!!.setOnClickListener(View.OnClickListener {
            if(edittextLogin!!.text.toString().equals(getString(R.string.activity_main_login)) && edittextPassword!!.text.toString().equals(getString(R.string.activity_main_password)))
                textviewStatus!!.setText(getString(R.string.activity_main_success))
        })

        buttonHideView!!.setOnClickListener(View.OnClickListener {
            buttonLogon!!.visibility= if(buttonLogon!!.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            textviewStatus!!.visibility= if(textviewStatus!!.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            edittextLogin!!.visibility= if(edittextLogin!!.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            edittextPassword!!.visibility= if(edittextPassword!!.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            buttonHideView!!.setText(if(buttonLogon!!.visibility==View.VISIBLE) getString(R.string.activity_main_button_hide_views) else getString(R.string.activity_main_button_show_views))
        })
    }
}
