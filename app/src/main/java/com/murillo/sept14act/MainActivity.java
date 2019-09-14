package com.murillo.sept14act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayMsg(View v){
        Intent i = new Intent(this, Plc.class);
        startActivity(i);
    }
    public void displayMsg2(View v){
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

}
