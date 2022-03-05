package com.example.vecelica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class rools extends AppCompatActivity {

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rools);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Кнопка назад
        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(rools.this, MainActivity.class);
                    startActivity(intent); finish();
                } catch (Exception e){

                }
            }
        });

    }
    //Системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(rools.this, MainActivity.class);
            startActivity(intent); finish();
        } catch (Exception e){

        }
    }
}