package com.jackest.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jackest.swoosh.Utilities.EXTRA_LEAGUE
import com.jackest.swoosh.R
import com.jackest.swoosh.Utilities.SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league =""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun beginnerClicked(view: View){
        skill = "beginner"
        ballerBtn.isChecked =false
    }

    fun ballerClicked(view: View){
        beginnerBtn.isChecked =false
        skill = "baller"
    }
    fun finishClicked(view: View){
        if(skill!=""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)//pass value
            finishActivity.putExtra(SKILL,skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select the skill", Toast.LENGTH_SHORT).show()
        }
    }
}
