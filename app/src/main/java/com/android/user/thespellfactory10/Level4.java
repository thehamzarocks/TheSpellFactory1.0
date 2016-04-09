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

import java.util.Timer;

public class Level4 extends AppCompatActivity {

    Timer timer;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

    }

    public void Stone1(View view) {
        Button b1 = (Button) findViewById(R.id.stone1);
        b1.setVisibility(View.INVISIBLE);


        Button b2 = (Button) findViewById(R.id.stone2);
        b2.setVisibility(View.VISIBLE);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b2 = (Button) findViewById(R.id.stone2);
                b2.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("1")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                Button b3 = (Button) findViewById(R.id.stone3);
                b3.setVisibility(View.VISIBLE);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Button b3 = (Button) findViewById(R.id.stone3);
                        b3.setVisibility(View.INVISIBLE);
                        SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                        String stonecount = sharedPreferences1.getString("StoneCount", null);
                        if (stonecount.equals("2")) {
                            Intent intent = new Intent(Level4.this, Level4Init.class);
                            startActivity(intent);
                        }

                        Button b4 = (Button) findViewById(R.id.stone4);
                        b4.setVisibility(View.VISIBLE);
                    }
                }, 800);
            }
        }, 800);

        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b4 = (Button) findViewById(R.id.stone4);
                b4.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("3")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                else {
                    Button b5 = (Button) findViewById(R.id.stone5);
                    b5.setVisibility(View.VISIBLE);
                }
            }
        },2400);

        Handler handler3 = new Handler();
        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b5 = (Button) findViewById(R.id.stone5);
                b5.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("4")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                else {
                    Button b6 = (Button) findViewById(R.id.stone6);
                    b6.setVisibility(View.VISIBLE);
                }
            }
        },3200);

        Handler handler4 = new Handler();
        handler4.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b6 = (Button) findViewById(R.id.stone6);
                b6.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("5")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                else {
                    Button b7 = (Button) findViewById(R.id.stone7);
                    b7.setVisibility(View.VISIBLE);
                }
            }
        },4000);

        Handler handler5 = new Handler();
        handler5.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b7 = (Button) findViewById(R.id.stone7);
                b7.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("6")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                else {
                    Button b8 = (Button) findViewById(R.id.stone8);
                    b8.setVisibility(View.VISIBLE);
                }
            }
        },4800);

        Handler handler6 = new Handler();
        handler6.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b8 = (Button) findViewById(R.id.stone8);
                b8.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("7")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                else {
                    Button b9 = (Button) findViewById(R.id.stone9);
                    b9.setVisibility(View.VISIBLE);
                }
            }
        },5600);

        Handler handler7 = new Handler();
        handler7.postDelayed(new Runnable() {
            @Override
            public void run() {
                Button b9 = (Button) findViewById(R.id.stone9);
                b9.setVisibility(View.INVISIBLE);
                SharedPreferences sharedPreferences1 = getSharedPreferences("L4", Context.MODE_PRIVATE);
                String stonecount = sharedPreferences1.getString("StoneCount", null);
                if (stonecount.equals("8")) {
                    Intent intent = new Intent(Level4.this, Level4Init.class);
                    startActivity(intent);
                }
                else if(stonecount.equals("9")){

                    /*Intent intent = new Intent(Level4.this,Level5Init.class);
                    startActivity(intent);*/
                    Toast.makeText(Level4.this, "Woo! I'm all wet now, but I made it. Got to be a bit more careful from now on.", Toast.LENGTH_SHORT).show();
                }
            }
        },6400);

    }

    public void Stone2(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","2");
        editor.commit();
    }

    public void Stone3(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","3");
        editor.commit();
    }

    public void Stone4(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","4");
        editor.commit();
    }

    public void Stone5(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","5");
        editor.commit();
    }

    public void Stone6(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","6");
        editor.commit();
    }

    public void Stone7(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","7");
        editor.commit();
    }

    public void Stone8(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","8");
        editor.commit();
    }

    public void Stone9(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("StoneCount","9");
        editor.commit();
    }

    public void Help(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("L4",Context.MODE_PRIVATE);
        if(sharedPreferences.getString("StoneCount",null).equals("1")) {
            Toast.makeText(this,"A river! I'm gonna have to use these stones to cross them. My stepping stones, I guess. But I'll have to be nimble",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Splash! Glub Glub! Stepping stones...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Level4Init.class);
            startActivity(intent);
        }
    }


}
