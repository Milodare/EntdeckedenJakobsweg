package com.example.jakobsweg.entdeckedenjakobsweg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class overallview_milestones extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overallview_milestones);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_overallview_milestones, menu);
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

    ///own stuff///

    public void open_information_milestone_11 (View view){

        Intent intent= new Intent(this, information_milestone_11.class);
        startActivity(intent);
    }

    public void open_information_milestone_12 (View view){

        Intent intent= new Intent(this, information_milestone_12.class);
        startActivity(intent);
    }

    public void open_information_milestone_19 (View view){

        Intent intent= new Intent(this, information_milestone_19.class);
        startActivity(intent);
    }

    public void open_information_milestone_23 (View view){

        Intent intent= new Intent(this, information_milestone_23.class);
        startActivity(intent);
    }
}
