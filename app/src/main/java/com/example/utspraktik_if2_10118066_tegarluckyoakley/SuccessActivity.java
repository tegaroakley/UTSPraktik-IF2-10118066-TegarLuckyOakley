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
public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Button btn = (Button) findViewById(R.id.okbtn);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(SuccessActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}