package com.example.vecelica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class ChoseTem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_tem);

        //---------------------------------------------------------------------------Города
        TextView town = (TextView) findViewById(R.id.town);
        town.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(ChoseTem.this, Tem1.class);
                    startActivity(intent);finish();
                } catch(Exception e){

                }
            }
        });


        //-------------------------------------------------------------------------Животные
        TextView dogs = (TextView) findViewById(R.id.dogs);
        dogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(ChoseTem.this, Tem2.class);
                    startActivity(intent);finish();
                } catch(Exception e){

                }
            }
        });


        //--------------------------------------------------------------------------Растения
        TextView flouwers = (TextView) findViewById(R.id.flouwers);
        flouwers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(ChoseTem.this, Tem3.class);
                    startActivity(intent);finish();
                } catch(Exception e){

                }
            }
        });

        TextView rands = (TextView) findViewById(R.id.rand);
        rands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(ChoseTem.this, ChooseNameTema.class);
                    startActivity(intent);finish();
                } catch(Exception e){

                }
            }
        });
        //-----------------------------------------------------------------Full Screen
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(ChoseTem.this, MainActivity.class);
            startActivity(intent); finish();
        } catch (Exception e){

        }
    }
}