package com.example.vecelica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //------------------------------------------------------------------Правила
        Button buttonRools = (Button) findViewById(R.id.buttonRools);
        buttonRools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(MainActivity.this, rools.class);
                    startActivity(intent);finish();
                } catch(Exception e){

                }
            }
        });

        //---------------------------------------------------------------------Играть
        TextView buttonStart = (TextView) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(MainActivity.this, ChoseTem.class);
                    startActivity(intent);finish();
                } catch(Exception e){

                }
            }
        });



        //-----------------------------------------------------------------Full Screen
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}