package com.mmdev.progressbutton_motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		btnDone.setOnClickListener {
			motionContainer.transitionToState(R.id.middle)
			Handler().postDelayed({motionContainer.transitionToState(R.id.scaled)}, 3000)
			Handler().postDelayed({motionContainer.transitionToState(R.id.end)}, 3400)
		}


	}
}
