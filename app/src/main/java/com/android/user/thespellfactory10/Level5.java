package com.android.user.thespellfactory10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.SocketHandler;

public class Level5 extends AppCompatActivity {

    String E_HP, E_Mana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
    }

    public void ViewStats(View view) {
        Intent intent =new Intent(this,Stats.class);
        startActivity(intent);
    }

    public void ElfAttack(View view) {
        Button e = (Button) findViewById(R.id.button25);
        e.setClickable(false);
        SharedPreferences sharedPreferences = getSharedPreferences("L5", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        E_HP = sharedPreferences.getString("E_HP", null);
        E_Mana = sharedPreferences.getString("E_Mana", null);
        int ehp = Integer.parseInt(E_HP);
        ehp -= 25;
        E_HP = Integer.toString(ehp);
        editor.putString("E_HP", E_HP);
        editor.commit();
        TextView e_hp_text = (TextView) findViewById(R.id.e_hp_text);
        e_hp_text.setText(E_HP);
        Toast.makeText(this,"Elf took 25 damage",Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPreferences1 = getSharedPreferences("Stats",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = sharedPreferences1.edit();
        String Mana = sharedPreferences1.getString("Mana", null);
        int mana = Integer.parseInt(Mana);
        mana -= 25;
        Mana = Integer.toString(mana);
        editor1.putString("Mana",Mana);
        editor1.commit();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences("L5",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("E_Mana",E_Mana);
                editor.commit();

                int ehp = Integer.parseInt(E_HP);
                if(ehp < 60) {
                    ehp += 25;
                    E_HP = Integer.toString(ehp);
                    editor.putString("E_HP", E_HP);
                    editor.commit();
                    Toast.makeText(Level5.this,"Elf restored 25 HP",Toast.LENGTH_SHORT).show();
                    Toast.makeText(Level5.this,"What? How did you do that?",Toast.LENGTH_SHORT).show();
                    Toast.makeText(Level5.this,"Elf: I thought so. You know nothing when it comes to fighting. Now... Wind Bind!",Toast.LENGTH_SHORT).show();

                }
                else {
                    int emana = Integer.parseInt(E_Mana);
                    emana -= 30;
                    E_Mana = Integer.toString(emana);


                    SharedPreferences sharedPreferences1 = getSharedPreferences("Stats", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor1 = sharedPreferences1.edit();
                    String HP = sharedPreferences1.getString("HP", null);
                    int hp = Integer.parseInt(HP);
                    hp -= 30;
                    HP = Integer.toString(hp);
                    editor1.putString("HP", HP);
                    editor1.commit();
                    Toast.makeText(Level5.this,"You took 25 damage",Toast.LENGTH_SHORT).show();
                }

                Button e = (Button) findViewById(R.id.button25);
                e.setClickable(true);
            }
        },1000);
    }
}
