package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stats extends AppCompatActivity {

    String Level, Complete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        SharedPreferences sharedPreferences = getSharedPreferences("Stats", Context.MODE_PRIVATE);
        Level = sharedPreferences.getString("Level",null);
        Complete = sharedPreferences.getString("Complete",null);
        if(Level.equals("2") && Complete.equals("1")) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("Mana","100");
            editor.putString("LightArrow","1");
            editor.putString("Complete","2");
            editor.commit();
            Complete = "2";

            TextView hp_text= (TextView) findViewById(R.id.hp_text);
            TextView mana_text = (TextView) findViewById(R.id.mana_text);
            TextView lightarrow_text = (TextView) findViewById(R.id.lightarrow_text);

            hp_text.setText("100");
            mana_text.setText("100");
            lightarrow_text.setText("Level 1");
        }

        if(Level.equals("3")) {
            SharedPreferences sharedPreferences1 = getSharedPreferences("Stats",Context.MODE_PRIVATE);
            String HP = sharedPreferences.getString("HP",null);
            String Mana = sharedPreferences.getString("Mana",null);
            String Gold = sharedPreferences.getString("Gold",null);


        }
    }

    public void Back(View view) {
        /*if(Level.equals("2") && Complete.equals("2")) {
            Intent intent = new Intent(this, Level2.class);
            startActivity(intent);
        }*/
        if(Level.equals("2")) {
            Intent intent = new Intent(this, Level2.class);
            startActivity(intent);
        }
        if(Level.equals("3")) {
            Intent intent = new Intent(this,Level3.class);
            startActivity(intent);
        }
    }
}
