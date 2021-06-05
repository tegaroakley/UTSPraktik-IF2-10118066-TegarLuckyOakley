package com.example.utspraktik_if2_10118066_tegarluckyoakley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Tanggal Pengerjaan : 05 Juni 2021
//NIM : 10118066
//Nama : Tegar Lucky Oakley
//Kelas : IF2
public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Button btn1 = (Button) findViewById(R.id.simpanbtn);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(CheckActivity.this,SuccessActivity.class);
                startActivity(i);
            }
        });
        Button btn2 = (Button) findViewById(R.id.ubahbtn);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(CheckActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}