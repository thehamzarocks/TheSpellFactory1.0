package com.android.user.thespellfactory10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void Level1Initialize(View view) {
        Intent intent = new Intent(this, Level1_Init.class);
        startActivity(intent);
    }
}
