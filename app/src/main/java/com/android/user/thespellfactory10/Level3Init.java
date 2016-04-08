package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level3Init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_init);
    }

    public void Level3(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("Stats", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Level","3");
        editor.putString("Complete", "0");
        editor.putString("HP","100");
        editor.commit();

        SharedPreferences sharedPreferences1 = getSharedPreferences("L3",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = sharedPreferences1.edit();
        editor1.putString("ElflingHP","25");
        editor1.commit();

        Intent intent = new Intent(this,Level3.class);
        startActivity(intent);
    }
}
