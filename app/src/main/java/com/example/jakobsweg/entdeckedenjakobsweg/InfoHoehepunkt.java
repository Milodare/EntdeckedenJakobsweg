package com.example.jakobsweg.entdeckedenjakobsweg;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class InfoHoehepunkt extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hoehepunkt);


        //////own extensions//////////
        //////get the message from the intent////////////////
        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        //get the text view
        TextView textView = (TextView) findViewById(R.id.message_text_view);
        textView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info_hoehepunkt, menu);
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

    /////////////////own stuff//////////////

    /*
    int merker = R.drawable.abc;

    public void changeImage(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.abc_image);
        {
            imageView.setImageResource(R.drawable.def);
            if (merker == R.drawable.abc) {
                merker = R.drawable.def;
                imageView.setImageResource(R.drawable.def);
            } else {
                merker = R.drawable.abc;
                imageView.setImageResource(R.drawable.abc);
            }
        }
    }
    */
}

