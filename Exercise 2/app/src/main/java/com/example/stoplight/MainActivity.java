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
        TextView lightTV = (TextView) findViewById(R.id.lightTV);

        switch (rf.statusCheck()){
            case "RED":
                lightTV.setText("RED LIGHT");
                lightTV.setBackgroundColor(getResources().getColor(R.color.red));
                rf.setStatus(0);
                break;
            case "GREEN":
                lightTV.setText("GREEN LIGHT");
                lightTV.setBackgroundColor(getResources().getColor(R.color.green));
                rf.setStatus(1);
                break;
            case "YELLOW":
                lightTV.setText("YELLOW LIGHT");
                lightTV.setBackgroundColor(getResources().getColor(R.color.yellow));
                rf.setStatus(-1);
                break;
        }

    }
}