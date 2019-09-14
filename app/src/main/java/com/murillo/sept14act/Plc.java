package com.murillo.sept14act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Plc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plc);
    }
    public void displayAR(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.360cities.net/image/ust-arch-of-the-centuries"));
        startActivity(i);
    }
    public void displayPZ(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/pages/Plaza-Mayor-University-of-Santo-Tomas/183307295048361"));
        startActivity(i);
    }
    public void displayRO(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Faculty_of_Engineering"));
        startActivity(i);
    }
    public void displayQP(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Quadricentennial_Pavilion"));
        startActivity(i);
    }
    public void displayRet(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
