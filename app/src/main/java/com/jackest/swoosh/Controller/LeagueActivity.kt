package com.jackest.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jackest.swoosh.Model.Player
import com.jackest.swoosh.R
import com.jackest.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player =  Player("","")

    //to keep the instance while change the ori
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun leagueNextClicked(view : View){
        if(player.league!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
     fun mensClicked(view : View){
         womensLeagueBtn.isChecked = false
         coedLeagueBtn.isChecked = false
         player.league = "mens"
     }
    fun womensClicked(view : View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }
    fun coedClicked(view : View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "coed"
    }
}
