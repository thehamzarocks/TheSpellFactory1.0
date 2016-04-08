package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        SharedPreferences sharedPreferences = getSharedPreferences("Stats",Context.MODE_PRIVATE);
        String Complete = sharedPreferences.getString("Complete",null);
        if(Complete.equals("2")) {
            //Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,Level3Init.class);
            startActivity(intent);
        }
    }

    public void ViewStats(View view) {
        Intent intent = new Intent(this,Stats.class);
        startActivity(intent);
    }

    public void Help1(View view) {
        Toast.makeText(this,"Mana... I've read about that somewhere. Oh! And that must be the legendary fountain. It looks... awesome!",Toast.LENGTH_LONG).show();
        Button button = (Button) findViewById(R.id.button8);
        button.setVisibility(View.VISIBLE);
    }

    public void VisitFountain(View view) {
        Toast.makeText(this,"Oooh, I feel the might, the energy, the awesomeness!. I want to see myself now.",Toast.LENGTH_LONG).show();
        SharedPreferences sharedPreferences = getSharedPreferences("Stats", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Mana","100");
        editor.putString("LightArrow","1");
        editor.putString("Complete","1");
        editor.commit();
    }
}
