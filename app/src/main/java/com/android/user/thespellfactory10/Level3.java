package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class Level3 extends AppCompatActivity {

    String Complete, HP, ElflingHP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        SharedPreferences sharedPreferences = getSharedPreferences("Stats", Context.MODE_PRIVATE);
        Complete=sharedPreferences.getString("Complete",null);
        if(Complete.equals("1")) {
            Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show();
        }
    }

    public void Help(View view) {
        if (Complete.equals("0")) {
            Toast.makeText(this,"I'm already awesome now. But a little more couldn't hurt.",Toast.LENGTH_SHORT).show();
        }
        else if(Complete.equals("1")) {
            Toast.makeText(this,"Ouch! Bad idea. I can touch it to use my Light Arrow on it. Better not get distracted anymore.",Toast.LENGTH_SHORT).show();

            SharedPreferences sharedPreferences = getSharedPreferences("Stats", Context.MODE_PRIVATE);
            HP = sharedPreferences.getString("HP",null);
            int hp = Integer.parseInt(HP);
            hp -= 10;
            HP = Integer.toString(hp);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("HP",HP);
            editor.commit();

            Toast.makeText(this,"Took 10 damage from Elfling",Toast.LENGTH_SHORT).show();
            if(hp<0) {
                Toast.makeText(this,"Nooo...",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,Level3Init.class);
                startActivity(intent);
            }

        }
    }

    public void FountainAgain(View view) {
        Button fbutton = (Button) findViewById(R.id.button12);
        fbutton.setVisibility(View.INVISIBLE);
        Toast.makeText(this,"The fountain vanished!",Toast.LENGTH_SHORT).show();
        for(int i=0;i<10000;i++);
        Button ebutton = (Button) findViewById(R.id.button13);
        ebutton.setVisibility(View.VISIBLE);
        Toast.makeText(this,"Elfling:The fountain's gone! You! You did this! I've been practicing, and now I'm going to vaporize you!",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"What IS that thing? Maybe checking out my trusty help bubble wouldn't be a bad idea.",Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPreferences = getSharedPreferences("Stats",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Complete","1");
        editor.commit();
        Complete="1";
    }

    public void ElfAttack(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L3", Context.MODE_PRIVATE);
        ElflingHP = sharedPreferences.getString("ElflingHP", null);
        int ehp = Integer.parseInt(ElflingHP);
        ehp -= 25;
        ElflingHP = Integer.toString(ehp);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("ElflingHP", ElflingHP);
        editor.commit();
        Toast.makeText(this,"Elfling took 25 damage",Toast.LENGTH_SHORT).show();

        Toast.makeText(this,"Elfling: Waa! I'm gonna tell the elders!",Toast.LENGTH_SHORT).show();
        Button ebutton = (Button) findViewById(R.id.button13);
        ebutton.setVisibility(View.GONE);
        for(int i=0;i<1000000;i++);
        /*Intent intent = new Intent(this,Level4Init.class);
        startActivity(intent);*/
    }


}
