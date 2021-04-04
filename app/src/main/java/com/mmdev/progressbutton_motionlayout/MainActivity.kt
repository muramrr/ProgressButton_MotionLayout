package com.mmdev.progressbutton_motionlayout

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.view.postDelayed

class MainActivity: AppCompatActivity(R.layout.activity_main) {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
		val btnDone = findViewById<Button>(R.id.btnDone)
		val motionContainer = findViewById<MotionLayout>(R.id.motionContainer)
		
		btnDone.setOnClickListener {
			
			motionContainer.transitionToState(R.id.middle)
			
			it.postDelayed(3000) {
				motionContainer.transitionToState(R.id.scaled)
			}
			it.postDelayed(3400) {
				motionContainer.transitionToState(R.id.end)
			}
		}

	}
}
