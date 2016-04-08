package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level2_Init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2__init);
    }

    public void Level2(View view) {
        SharedPreferences sharedPreferences=getSharedPreferences("Stats", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("HP","100");
        editor.putString("Mana","0");
        editor.putString("Level","2");
        editor.putString("Complete", "0");
        editor.commit();

        Intent intent = new Intent(this,Level2.class);
        startActivity(intent);
    }
}
