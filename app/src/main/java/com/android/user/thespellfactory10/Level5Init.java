package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Level5Init extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5_init);

        SharedPreferences sharedPreferences = getSharedPreferences("Stats", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("HP", "100");
        editor.putString("Mana", "100");
        editor.putString("Level", "5");
        editor.commit();

        SharedPreferences sharedPreferences1 = getSharedPreferences("L5",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = sharedPreferences1.edit();
        editor1.putString("E_HP","100");
        editor1.putString("E_Mana","1750");
        editor1.commit();

        Toast.makeText(this,"That was quite fun. But I'm lost now.",Toast.LENGTH_SHORT).show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b1 = (Button) findViewById(R.id.button23);
                b1.setVisibility(View.VISIBLE);
                Toast.makeText(Level5Init.this, "Woah! Where did you come from?", Toast.LENGTH_SHORT).show();
                Toast.makeText(Level5Init.this,"Elf: You need to come with me.",Toast.LENGTH_SHORT).show();
                Toast.makeText(Level5Init.this,"Oh yeah? Well no wierd forest creature is gonna tell me where to go.",Toast.LENGTH_LONG).show();
            }
        }, 5000);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Level5Init.this,Level5.class);
                startActivity(intent);
            }
        },8000);
    }
}
