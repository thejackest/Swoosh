package com.jackest.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jackest.swoosh.Utilities.EXTRA_LEAGUE
import com.jackest.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun leagueNextClicked(view : View){
        if(selectedLeague!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }
     fun mensClicked(view : View){
         womensLeagueBtn.isChecked = false
         coedLeagueBtn.isChecked = false
         selectedLeague = "mens"
     }
    fun womensClicked(view : View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }
    fun coedClicked(view : View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "coed"
    }
}
