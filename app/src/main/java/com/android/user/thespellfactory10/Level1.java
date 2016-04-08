package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        SharedPreferences sharedPreferences = getSharedPreferences("L1", Context.MODE_PRIVATE);
        String Complete =sharedPreferences.getString("Complete", null);
        int comp = Integer.parseInt(Complete);
        if(comp==1) {
            Intent intent = new Intent(this,Level2_Init.class);
            startActivity(intent);
        }
    }

    public void ViewStats(View view) {
        Intent intent = new Intent(this,Stats1.class);
        startActivity(intent);
    }
}
