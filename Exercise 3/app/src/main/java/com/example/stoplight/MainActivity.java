package com.example.stoplight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public RightFragment rf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rf = new RightFragment();
    }

    public void click(View view){
        TextView redTV = (TextView) findViewById(R.id.redTV);
        TextView yellowTV = (TextView) findViewById(R.id.yellowTV);
        TextView greenTV = (TextView) findViewById(R.id.greenTV);

        switch (rf.statusCheck()){
            case "RED":
                redTV.setAlpha(1);
                yellowTV.setAlpha(.2f);
                greenTV.setAlpha(.2f);
                rf.setStatus(0);
                break;
            case "GREEN":
                redTV.setAlpha(.2f);
                yellowTV.setAlpha(.2f);
                greenTV.setAlpha(1);
                rf.setStatus(1);
                break;
            case "YELLOW":
                redTV.setAlpha(.2f);
                yellowTV.setAlpha(1);
                greenTV.setAlpha(.2f);
                rf.setStatus(-1);
                break;
        }

    }
}