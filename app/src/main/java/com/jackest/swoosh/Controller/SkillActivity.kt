package com.jackest.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jackest.swoosh.Model.Player
import com.jackest.swoosh.Utilities.EXTRA_PLAYER
import com.jackest.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    //var league =""
    lateinit var player : Player //var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }
    fun beginnerClicked(view: View){
        player.skill = "beginner"
        ballerBtn.isChecked =false
    }

    fun ballerClicked(view: View){
        beginnerBtn.isChecked =false
        player.skill = "baller"
    }
    fun finishClicked(view: View){
        if(player.skill!=""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)//pass value
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select the skill", Toast.LENGTH_SHORT).show()
        }
    }
}
