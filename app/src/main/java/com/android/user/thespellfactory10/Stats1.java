package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stats1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats1);
    }

    public void BackToL1(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Complete","1");
        editor.commit();

        Intent intent = new Intent(this,Level1.class);
        startActivity(intent);
    }

}
