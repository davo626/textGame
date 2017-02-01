package com.example.student4.textgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        int decision =0;
    }
    public int decision =0;

    public void toHome(View view){
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void decision1(View view){
    decision =1;
    }

    public void decision2 (View view){
    decision =2;
    }
    TextView tv =(TextView) findViewById(R.id.textView2);
    tv.setText("Привет, ");
}
