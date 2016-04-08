package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level1_Init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1__init);
    }

    public void Level1(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("HP","100");
        editor.putString("Level","1");
        editor.putString("Complete","0");
        editor.commit();
        Intent intent = new Intent(this, Level1.class);
        startActivity(intent);
    }
}
