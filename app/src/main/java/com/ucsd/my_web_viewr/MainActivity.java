/*
    Sina Gharavi
    Android Programming 1
    Assignment 1
 */

package com.ucsd.my_web_viewr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonYahoo;
    private Button buttonUCSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonYahoo = (Button) findViewById(R.id.buttonYahoo);
        buttonYahoo.setOnClickListener(this);

        buttonUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonYahoo:
                Intent yahooActivity = new Intent(this, YahooActivity.class);
                startActivity(yahooActivity);
                break;
            case R.id.buttonUCSD:
                Intent USCSAvtivity = new Intent(this, UCSDActivity.class);
                startActivity(USCSAvtivity);
                break;
        }
    }
}
