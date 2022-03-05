package com.example.vecelica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Tem1 extends AppCompatActivity {

    private TextView Name2,WinOrLose, textView1,textView2,textView3,textView4,textView5,textView6;
    private ImageView imageView1;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13,
            btn14, btn15, btn16, btn17, btn18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tem1);

        //------------------------------------------------------------------------------------------Кнопки и текст создание
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        WinOrLose = (TextView) findViewById(R.id.winOrLose);
        Name2 = (TextView) findViewById(R.id.Name2);
        btn1 = (Button) findViewById(R.id.butn1);
        btn2 = (Button) findViewById(R.id.butn2);
        btn3 = (Button) findViewById(R.id.butn3);
        btn4 = (Button) findViewById(R.id.butn4);
        btn5 = (Button) findViewById(R.id.butn5);
        btn6 = (Button) findViewById(R.id.butn6);
        btn7 = (Button) findViewById(R.id.butn7);
        btn8 = (Button) findViewById(R.id.butn8);
        btn9 = (Button) findViewById(R.id.butn9);
        btn10 = (Button) findViewById(R.id.butn10);
        btn11 = (Button) findViewById(R.id.butn11);
        btn12 = (Button) findViewById(R.id.butn12);
        btn13 = (Button) findViewById(R.id.butn13);
        btn14 = (Button) findViewById(R.id.butn14);
        btn15 = (Button) findViewById(R.id.butn15);
        btn16 = (Button) findViewById(R.id.butn16);
        btn17 = (Button) findViewById(R.id.butn17);
        btn18 = (Button) findViewById(R.id.butn18);



        //------------------------------------------------------------------------------------------Основная логика и механика игры

        int j = 0;
        final int[] b = { 0 };
        final int[] f = { 0 };

        j = 1 + (int) (Math.random() * 5);

        if(j == 1){
            if(f[0] == 0 && b[0] == 0){
                textView1.setText("*");
                textView2.setText("*");
                textView3.setText("*");
                textView4.setText("*");
                textView5.setText("*");
                textView6.setText("*");
            }

            Name2.setText("Город спалили парочку раз");
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                    if(f[0] <= 5 && b[0] <  6){
                        switch (view.getId()){
                            case R.id.butn9: textView1.setText("М"); WinOrLose.setText("Все верно"); btn9.setEnabled(false); ;b[0] +=1 ;break;
                            case R.id.butn11: textView2.setText("О"); WinOrLose.setText("Все верно"); btn11.setEnabled(false); b[0] +=1;break;
                            case R.id.butn14: textView3.setText("С"); WinOrLose.setText("Все верно"); btn14.setEnabled(false);b[0] +=1;break;
                            case R.id.butn8: textView4.setText("К"); WinOrLose.setText("Все верно");btn8.setEnabled(false);b[0] +=1;break;
                            case R.id.butn3: textView5.setText("В"); WinOrLose.setText("Все верно");btn3.setEnabled(false);b[0] +=1;break;
                            case R.id.butn1: textView6.setText("А"); WinOrLose.setText("Все верно");btn1.setEnabled(false);b[0] +=1;break;
                        }

                        switch (view.getId()){
                            case R.id.butn2: f[0]++; WinOrLose.setText("Неверно");btn2.setEnabled(false); break;
                            case R.id.butn4: f[0]++; WinOrLose.setText("Неверно");btn4.setEnabled(false); break;
                            case R.id.butn5: f[0]++; WinOrLose.setText("Неверно");btn5.setEnabled(false); break;
                            case R.id.butn6: f[0]++; WinOrLose.setText("Неверно");btn6.setEnabled(false); break;
                            case R.id.butn7: f[0]++; WinOrLose.setText("Неверно");btn7.setEnabled(false); break;
                            case R.id.butn10: f[0]++; WinOrLose.setText("Неверно");btn10.setEnabled(false); break;
                            case R.id.butn12: f[0]++; WinOrLose.setText("Неверно");btn12.setEnabled(false); break;
                            case R.id.butn13: f[0]++; WinOrLose.setText("Неверно");btn13.setEnabled(false); break;
                            case R.id.butn15: f[0]++; WinOrLose.setText("Неверно");btn15.setEnabled(false); break;
                            case R.id.butn16: f[0]++; WinOrLose.setText("Неверно");btn16.setEnabled(false); break;
                            case R.id.butn17: f[0]++; WinOrLose.setText("Неверно");btn17.setEnabled(false); break;
                            case R.id.butn18: f[0]++; WinOrLose.setText("Неверно");btn18.setEnabled(false); break;
                        }

                    }
                    if(f[0] == 1) imageView1.setImageResource(R.drawable.sost2);
                    if(f[0] == 2) imageView1.setImageResource(R.drawable.sost3);
                    if(f[0] == 3) imageView1.setImageResource(R.drawable.sost4);
                    if(f[0] == 4) imageView1.setImageResource(R.drawable.sost5);
                    if(f[0] == 5) imageView1.setImageResource(R.drawable.sost6);
                    if(f[0] == 6) imageView1.setImageResource(R.drawable.sost7);
                    if(f[0] == 6){
                        WinOrLose.setText("Вы проиграли");
                    }
                    if(b[0] == 6) WinOrLose.setText("Вы выиграли");

                }


            };


            btn1.setOnClickListener(onClickListener);
            btn3.setOnClickListener(onClickListener);
            btn11.setOnClickListener(onClickListener);
            btn8.setOnClickListener(onClickListener);
            btn14.setOnClickListener(onClickListener);
            btn9.setOnClickListener(onClickListener);
            btn2.setOnClickListener(onClickListener);
            btn5.setOnClickListener(onClickListener);
            btn4.setOnClickListener(onClickListener);
            btn7.setOnClickListener(onClickListener);
            btn10.setOnClickListener(onClickListener);
            btn12.setOnClickListener(onClickListener);
            btn13.setOnClickListener(onClickListener);
            btn15.setOnClickListener(onClickListener);
            btn16.setOnClickListener(onClickListener);
            btn17.setOnClickListener(onClickListener);
            btn6.setOnClickListener(onClickListener);
            btn18.setOnClickListener(onClickListener);
        }

        if(j == 2){
            if(f[0] == 0 && b[0] == 0){
                textView1.setText("*");
                textView2.setText("*");
                textView3.setText("*");
                textView4.setText("*");
                textView5.setText("*");
                textView6.setText("*");
            }

            Name2.setText("Произошла трагедия гимназии 175");
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //------------------------------------------------------------------------------Нужные буквы для города МОСКВА

                    if(f[0] <= 5 && b[0] <  5){
                        switch (view.getId()){
                            case R.id.butn8: textView1.setText("К"); WinOrLose.setText("Все верно");btn8.setEnabled(false); b[0] +=1; break;
                            case R.id.butn1: textView2.setText("А"); textView4.setText("А"); WinOrLose.setText("Все верно");btn1.setEnabled(false); b[0] +=1; break;
                            case R.id.butn6: textView3.setText("З"); WinOrLose.setText("Все верно"); b[0] +=1;btn6.setEnabled(false); break;
                            case R.id.butn10: textView5.setText("Н"); WinOrLose.setText("Все верно"); b[0] +=1;btn10.setEnabled(false); break;
                            case R.id.butn16: textView6.setText("Ь"); WinOrLose.setText("Все верно"); b[0] +=1;btn16.setEnabled(false); break;
                        }
                        //------------------------------------------------------------------------------
                        switch (view.getId()){
                            case R.id.butn2: f[0]++; WinOrLose.setText("Неверно"); btn2.setEnabled(false);break;
                            case R.id.butn3: f[0]++; WinOrLose.setText("Неверно"); btn3.setEnabled(false);break;
                            case R.id.butn4: f[0]++; WinOrLose.setText("Неверно"); btn4.setEnabled(false); break;
                            case R.id.butn5: f[0]++; WinOrLose.setText("Неверно"); btn5.setEnabled(false);break;
                            case R.id.butn9: f[0]++; WinOrLose.setText("Неверно"); btn9.setEnabled(false);break;
                            case R.id.butn7: f[0]++; WinOrLose.setText("Неверно"); btn7.setEnabled(false);break;
                            case R.id.butn11: f[0]++; WinOrLose.setText("Неверно");btn11.setEnabled(false); break;
                            case R.id.butn12: f[0]++; WinOrLose.setText("Неверно");btn12.setEnabled(false); break;
                            case R.id.butn13: f[0]++; WinOrLose.setText("Неверно");btn13.setEnabled(false); break;
                            case R.id.butn15: f[0]++; WinOrLose.setText("Неверно");btn15.setEnabled(false); break;
                            case R.id.butn14: f[0]++; WinOrLose.setText("Неверно");btn14.setEnabled(false); break;
                            case R.id.butn17: f[0]++; WinOrLose.setText("Неверно");btn17.setEnabled(false); break;
                            case R.id.butn18: f[0]++; WinOrLose.setText("Неверно");btn18.setEnabled(false); break;
                        }

                    }
                    if(f[0] == 1) imageView1.setImageResource(R.drawable.sost2);
                    if(f[0] == 2) imageView1.setImageResource(R.drawable.sost3);
                    if(f[0] == 3) imageView1.setImageResource(R.drawable.sost4);
                    if(f[0] == 4) imageView1.setImageResource(R.drawable.sost5);
                    if(f[0] == 5) imageView1.setImageResource(R.drawable.sost6);
                    if(f[0] == 6) imageView1.setImageResource(R.drawable.sost7);
                    if(f[0] == 6){
                        WinOrLose.setText("Вы проиграли");
                    }
                    if(b[0] == 5) WinOrLose.setText("Вы выиграли");
                }


            };


            btn1.setOnClickListener(onClickListener);
            btn3.setOnClickListener(onClickListener);
            btn11.setOnClickListener(onClickListener);
            btn8.setOnClickListener(onClickListener);
            btn14.setOnClickListener(onClickListener);
            btn9.setOnClickListener(onClickListener);
            btn2.setOnClickListener(onClickListener);
            btn5.setOnClickListener(onClickListener);
            btn4.setOnClickListener(onClickListener);
            btn7.setOnClickListener(onClickListener);
            btn10.setOnClickListener(onClickListener);
            btn12.setOnClickListener(onClickListener);
            btn13.setOnClickListener(onClickListener);
            btn15.setOnClickListener(onClickListener);
            btn16.setOnClickListener(onClickListener);
            btn17.setOnClickListener(onClickListener);
            btn6.setOnClickListener(onClickListener);
            btn18.setOnClickListener(onClickListener);
        }

        if(j == 3){
            if(f[0] == 0 && b[0] == 0){
                textView1.setText("*");
                textView2.setText("*");
                textView3.setText("*");
                textView4.setText("*");
                textView5.setText("*");
                textView6.setText(" ");
            }

            Name2.setText("Здесь башню строили не эльфы");
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //------------------------------------------------------------------------------Нужные буквы для города МОСКВА

                    if(f[0] <= 5 && b[0] <  5){
                        switch (view.getId()){
                            case R.id.butn12: textView1.setText("П"); WinOrLose.setText("Все верно");btn12.setEnabled(false);b[0] +=1; break;
                            case R.id.butn1: textView2.setText("А"); WinOrLose.setText("Все верно");btn1.setEnabled(false);b[0] +=1;  break;
                            case R.id.butn13: textView3.setText("Р"); WinOrLose.setText("Все верно");btn13.setEnabled(false);b[0] +=1; break;
                            case R.id.butn7: textView4.setText("И"); WinOrLose.setText("Все верно");btn7.setEnabled(false);b[0] +=1; break;
                            case R.id.butn5: textView5.setText("Ж"); WinOrLose.setText("Все верно");btn5.setEnabled(false);b[0] +=1; break;
                        }
                        //------------------------------------------------------------------------------
                        switch (view.getId()){
                            case R.id.butn2: f[0]++; WinOrLose.setText("Неверно"); btn2.setEnabled(false);break;
                            case R.id.butn3: f[0]++; WinOrLose.setText("Неверно"); btn3.setEnabled(false);break;
                            case R.id.butn4: f[0]++; WinOrLose.setText("Неверно"); btn4.setEnabled(false);break;
                            case R.id.butn6: f[0]++; WinOrLose.setText("Неверно"); btn6.setEnabled(false);break;
                            case R.id.butn9: f[0]++; WinOrLose.setText("Неверно"); btn9.setEnabled(false);break;
                            case R.id.butn8: f[0]++; WinOrLose.setText("Неверно"); btn8.setEnabled(false);break;
                            case R.id.butn11: f[0]++; WinOrLose.setText("Неверно"); btn11.setEnabled(false);break;
                            case R.id.butn10: f[0]++; WinOrLose.setText("Неверно"); btn10.setEnabled(false);break;
                            case R.id.butn16: f[0]++; WinOrLose.setText("Неверно"); btn16.setEnabled(false);break;
                            case R.id.butn15: f[0]++; WinOrLose.setText("Неверно"); btn15.setEnabled(false);break;
                            case R.id.butn14: f[0]++; WinOrLose.setText("Неверно"); btn14.setEnabled(false);break;
                            case R.id.butn17: f[0]++; WinOrLose.setText("Неверно"); btn17.setEnabled(false);break;
                            case R.id.butn18: f[0]++; WinOrLose.setText("Неверно"); btn18.setEnabled(false);break;
                        }

                    }
                    if(f[0] == 1) imageView1.setImageResource(R.drawable.sost2);
                    if(f[0] == 2) imageView1.setImageResource(R.drawable.sost3);
                    if(f[0] == 3) imageView1.setImageResource(R.drawable.sost4);
                    if(f[0] == 4) imageView1.setImageResource(R.drawable.sost5);
                    if(f[0] == 5) imageView1.setImageResource(R.drawable.sost6);
                    if(f[0] == 6) imageView1.setImageResource(R.drawable.sost7);
                    if(f[0] == 6){
                        WinOrLose.setText("Вы проиграли");
                    }
                    if(b[0] == 5) WinOrLose.setText("Вы выиграли");
                }


            };


            btn1.setOnClickListener(onClickListener);
            btn3.setOnClickListener(onClickListener);
            btn11.setOnClickListener(onClickListener);
            btn8.setOnClickListener(onClickListener);
            btn14.setOnClickListener(onClickListener);
            btn9.setOnClickListener(onClickListener);
            btn2.setOnClickListener(onClickListener);
            btn5.setOnClickListener(onClickListener);
            btn4.setOnClickListener(onClickListener);
            btn7.setOnClickListener(onClickListener);
            btn10.setOnClickListener(onClickListener);
            btn12.setOnClickListener(onClickListener);
            btn13.setOnClickListener(onClickListener);
            btn15.setOnClickListener(onClickListener);
            btn16.setOnClickListener(onClickListener);
            btn17.setOnClickListener(onClickListener);
            btn6.setOnClickListener(onClickListener);
            btn18.setOnClickListener(onClickListener);
        }

        if(j == 4){
            if(f[0] == 0 && b[0] == 0){
                textView1.setText("*");
                textView2.setText("*");
                textView3.setText("*");
                textView4.setText("*");
                textView5.setText("*");
                textView6.setText("*");
            }

            Name2.setText("Здесь самый престижнейший ВУЗ");
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //------------------------------------------------------------------------------Нужные буквы для города МОСКВА

                    if(f[0] <= 5 && b[0] <  6){
                        switch (view.getId()){
                            case R.id.butn2: textView1.setText("Б"); WinOrLose.setText("Все верно");btn2.setEnabled(false);b[0] +=1; break;
                            case R.id.butn13: textView2.setText("Р"); WinOrLose.setText("Все верно");btn13.setEnabled(false);b[0] +=1;  break;
                            case R.id.butn18: textView3.setText("Я"); WinOrLose.setText("Все верно");btn18.setEnabled(false);b[0] +=1; break;
                            case R.id.butn10: textView4.setText("Н"); WinOrLose.setText("Все верно");btn10.setEnabled(false);b[0] +=1; break;
                            case R.id.butn14: textView5.setText("С"); WinOrLose.setText("Все верно");btn14.setEnabled(false);b[0] +=1; break;
                            case R.id.butn8: textView6.setText("К"); WinOrLose.setText("Все верно");btn8.setEnabled(false);b[0] +=1; break;
                        }
                        //------------------------------------------------------------------------------
                        switch (view.getId()){
                            case R.id.butn1: f[0]++; WinOrLose.setText("Неверно"); btn1.setEnabled(false);break;
                            case R.id.butn3: f[0]++; WinOrLose.setText("Неверно"); btn3.setEnabled(false);break;
                            case R.id.butn4: f[0]++; WinOrLose.setText("Неверно"); btn4.setEnabled(false);break;
                            case R.id.butn5: f[0]++; WinOrLose.setText("Неверно"); btn5.setEnabled(false);break;
                            case R.id.butn9: f[0]++; WinOrLose.setText("Неверно"); btn9.setEnabled(false);break;
                            case R.id.butn7: f[0]++; WinOrLose.setText("Неверно"); btn7.setEnabled(false);break;
                            case R.id.butn11: f[0]++; WinOrLose.setText("Неверно");btn11.setEnabled(false); break;
                            case R.id.butn12: f[0]++; WinOrLose.setText("Неверно");btn12.setEnabled(false); break;
                            case R.id.butn6: f[0]++; WinOrLose.setText("Неверно"); btn6.setEnabled(false);break;
                            case R.id.butn15: f[0]++; WinOrLose.setText("Неверно");btn15.setEnabled(false); break;
                            case R.id.butn16: f[0]++; WinOrLose.setText("Неверно");btn16.setEnabled(false); break;
                            case R.id.butn17: f[0]++; WinOrLose.setText("Неверно");btn17.setEnabled(false); break;
                        }

                    }
                    if(f[0] == 1) imageView1.setImageResource(R.drawable.sost2);
                    if(f[0] == 2) imageView1.setImageResource(R.drawable.sost3);
                    if(f[0] == 3) imageView1.setImageResource(R.drawable.sost4);
                    if(f[0] == 4) imageView1.setImageResource(R.drawable.sost5);
                    if(f[0] == 5) imageView1.setImageResource(R.drawable.sost6);
                    if(f[0] == 6) imageView1.setImageResource(R.drawable.sost7);
                    if(f[0] == 6){
                        WinOrLose.setText("Вы проиграли");
                    }
                    if(b[0] == 6) WinOrLose.setText("Вы выиграли");
                }


            };


            btn1.setOnClickListener(onClickListener);
            btn3.setOnClickListener(onClickListener);
            btn11.setOnClickListener(onClickListener);
            btn8.setOnClickListener(onClickListener);
            btn14.setOnClickListener(onClickListener);
            btn9.setOnClickListener(onClickListener);
            btn2.setOnClickListener(onClickListener);
            btn5.setOnClickListener(onClickListener);
            btn4.setOnClickListener(onClickListener);
            btn7.setOnClickListener(onClickListener);
            btn10.setOnClickListener(onClickListener);
            btn12.setOnClickListener(onClickListener);
            btn13.setOnClickListener(onClickListener);
            btn15.setOnClickListener(onClickListener);
            btn16.setOnClickListener(onClickListener);
            btn17.setOnClickListener(onClickListener);
            btn6.setOnClickListener(onClickListener);
            btn18.setOnClickListener(onClickListener);
        }

        if(j == 5){
            if(f[0] == 0 && b[0] == 0){
                textView1.setText(" ");
                textView2.setText("*");
                textView3.setText("*");
                textView4.setText("*");
                textView5.setText("*");
                textView6.setText(" ");
            }

            Name2.setText("Изначальная столица Руси");
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if(f[0] <= 5 && b[0] <  4){
                        switch (view.getId()){
                            case R.id.butn8: textView2.setText("К"); WinOrLose.setText("Все верно");btn8.setEnabled(false);b[0] +=1; break;
                            case R.id.butn7: textView3.setText("И"); WinOrLose.setText("Все верно");btn7.setEnabled(false);b[0] +=1;  break;
                            case R.id.butn4: textView4.setText("Е"); WinOrLose.setText("Все верно");btn4.setEnabled(false);b[0] +=1; break;
                            case R.id.butn3: textView5.setText("В"); WinOrLose.setText("Все верно");btn3.setEnabled(false);b[0] +=1; break;

                        }

                        switch (view.getId()){
                            case R.id.butn2: f[0]++; WinOrLose.setText("Неверно"); btn2.setEnabled(false);break;
                            case R.id.butn1: f[0]++; WinOrLose.setText("Неверно"); btn1.setEnabled(false);break;
                            case R.id.butn6: f[0]++; WinOrLose.setText("Неверно"); btn6.setEnabled(false);break;
                            case R.id.butn5: f[0]++; WinOrLose.setText("Неверно"); btn5.setEnabled(false);break;
                            case R.id.butn9: f[0]++; WinOrLose.setText("Неверно"); btn9.setEnabled(false);break;
                            case R.id.butn10: f[0]++; WinOrLose.setText("Неверно");btn10.setEnabled(false); break;
                            case R.id.butn11: f[0]++; WinOrLose.setText("Неверно");btn11.setEnabled(false); break;
                            case R.id.butn12: f[0]++; WinOrLose.setText("Неверно");btn12.setEnabled(false); break;
                            case R.id.butn13: f[0]++; WinOrLose.setText("Неверно");btn13.setEnabled(false); break;
                            case R.id.butn15: f[0]++; WinOrLose.setText("Неверно");btn15.setEnabled(false); break;
                            case R.id.butn16: f[0]++; WinOrLose.setText("Неверно");btn16.setEnabled(false); break;
                            case R.id.butn14: f[0]++; WinOrLose.setText("Неверно");btn14.setEnabled(false); break;
                            case R.id.butn17: f[0]++; WinOrLose.setText("Неверно");btn17.setEnabled(false); break;
                            case R.id.butn18: f[0]++; WinOrLose.setText("Неверно");btn18.setEnabled(false); break;
                        }

                    }
                    if(f[0] == 1) imageView1.setImageResource(R.drawable.sost2);
                    if(f[0] == 2) imageView1.setImageResource(R.drawable.sost3);
                    if(f[0] == 3) imageView1.setImageResource(R.drawable.sost4);
                    if(f[0] == 4) imageView1.setImageResource(R.drawable.sost5);
                    if(f[0] == 5) imageView1.setImageResource(R.drawable.sost6);
                    if(f[0] == 6) imageView1.setImageResource(R.drawable.sost7);
                    if(f[0] == 6){
                        WinOrLose.setText("Вы проиграли");
                    }
                    if(b[0] == 4) WinOrLose.setText("Вы выиграли");
                }


            };


            btn1.setOnClickListener(onClickListener);
            btn3.setOnClickListener(onClickListener);
            btn11.setOnClickListener(onClickListener);
            btn8.setOnClickListener(onClickListener);
            btn14.setOnClickListener(onClickListener);
            btn9.setOnClickListener(onClickListener);
            btn2.setOnClickListener(onClickListener);
            btn5.setOnClickListener(onClickListener);
            btn4.setOnClickListener(onClickListener);
            btn7.setOnClickListener(onClickListener);
            btn10.setOnClickListener(onClickListener);
            btn12.setOnClickListener(onClickListener);
            btn13.setOnClickListener(onClickListener);
            btn15.setOnClickListener(onClickListener);
            btn16.setOnClickListener(onClickListener);
            btn17.setOnClickListener(onClickListener);
            btn6.setOnClickListener(onClickListener);
            btn18.setOnClickListener(onClickListener);
        }
        TextView last1 = (TextView) findViewById(R.id.last1);
        last1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(Tem1.this, ChoseTem.class);
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
            Intent intent = new Intent(Tem1.this, ChoseTem.class);
            startActivity(intent); finish();
        } catch (Exception e){

        }
    }
}