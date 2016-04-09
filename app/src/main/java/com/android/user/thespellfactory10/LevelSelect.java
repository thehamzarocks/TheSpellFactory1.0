package com.android.user.thespellfactory10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
    }

    public void Go1(View view) {
        Intent intent = new Intent(this, Level1_Init.class);
        startActivity(intent);
    }

    public void Go2(View view) {
        Intent intent = new Intent(this, Level2_Init.class);
        startActivity(intent);
    }

    public void Go3(View view) {
        Intent intent = new Intent(this, Level3Init.class);
        startActivity(intent);
    }

    public void Go4(View view) {
        Intent intent = new Intent(this, Level4Init.class);
        startActivity(intent);
    }
}
