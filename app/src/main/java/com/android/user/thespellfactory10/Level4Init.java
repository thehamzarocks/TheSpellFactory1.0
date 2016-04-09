package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level4Init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4_init);

        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","1");
        editor.commit();

    }

    public void Level4(View view){
        Intent intent = new Intent(this,Level4.class);
        startActivity(intent);
    }
}
