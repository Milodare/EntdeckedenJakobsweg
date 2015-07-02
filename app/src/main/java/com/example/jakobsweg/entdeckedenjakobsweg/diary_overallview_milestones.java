package com.example.jakobsweg.entdeckedenjakobsweg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class diary_overallview_milestones extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_overallview_milestones);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_diary_overallview_milestones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    //////////////////////own stuff    ///////////////


    public void open_diary_entry(View view) {

        Intent intent = new Intent(this, diary_entry.class);


        RadioGroup radioMilestones = (RadioGroup) findViewById(R.id.milestones);
        int selectedId = radioMilestones.getCheckedRadioButtonId();
        RadioButton selectedMilestone = (RadioButton) findViewById(selectedId);
        String etappe = selectedMilestone.getText().toString();
        intent.putExtra("ETAPPE",etappe);
        startActivity(intent);}


}







  //  public void showCity1 (View view){
   //     RadioGroup radioCities=(RadioGroup) findViewById(R.id.streckenabschnitte);
   //     int selectedId=radioCities.getCheckedRadioButtonId();
   //     String cityText;
        // switch (selectedId)

    //}
//}
