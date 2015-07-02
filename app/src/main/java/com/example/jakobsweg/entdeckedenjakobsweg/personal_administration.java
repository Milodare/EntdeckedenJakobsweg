package com.example.jakobsweg.entdeckedenjakobsweg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class personal_administration extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_administration);

        //own extensions//
        //get the message from the intent//

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        //get the text//
        
        TextView textView = (TextView) findViewById(R.id.message_text_view);
        textView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_personal_administration, menu);
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

    public void open_overallview_milestones (View view){

        Intent intent= new Intent(this, overallview_milestones.class);
        startActivity(intent);
    }

    public void open_diary_overallview_milestones (View view){

        Intent intent= new Intent(this, diary_overallview_milestones.class);
        startActivity(intent);
    }
    public void open_tipps (View view){

        Intent intent= new Intent(this, Tipps.class);
        startActivity(intent);
    }
}
