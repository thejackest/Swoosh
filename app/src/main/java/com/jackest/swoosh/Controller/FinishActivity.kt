
package com.jackest.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jackest.swoosh.R
import com.jackest.swoosh.Utilities.EXTRA_LEAGUE
import com.jackest.swoosh.Utilities.SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(SKILL)
         searchLeagueText.text = "Looking for $league $skill near you ...."
    }

}
