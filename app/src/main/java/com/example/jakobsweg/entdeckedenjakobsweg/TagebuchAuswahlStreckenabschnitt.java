package com.example.jakobsweg.entdeckedenjakobsweg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class TagebuchAuswahlStreckenabschnitt extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagebuch_auswahl_streckenabschnitt);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tagebuch_auswahl_streckenabschnitt, menu);
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

    //////////////////////own stuff - Activity 6   ///////////////






    public void showCity1 (View view){
        RadioGroup radioCities=(RadioGroup) findViewById(R.id.streckenabschnitte);
        int selectedId=radioCities.getCheckedRadioButtonId();
        String cityText;
        // switch (selectedId)

    }
}
