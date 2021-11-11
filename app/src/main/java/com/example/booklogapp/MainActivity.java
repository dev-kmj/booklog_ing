package com.example.booklogapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_REG = 201;
    public static final int REQUEST_CODE_WRITE = 202;
    public static final int REQUEST_CODE_GOAL = 203;
    public static final int REQUEST_CODE_MY = 304;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menu01Btn = findViewById(R.id.btn_reg);
        menu01Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                intent.putExtra("titleMsg", "도서검색화면");
                startActivityForResult(intent, REQUEST_CODE_REG);
            }
        });

        Button menu02Btn = findViewById(R.id.btn_write);
        menu02Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WriteActivity.class);
                intent.putExtra("titleMsg", "독서기록화면");
                startActivityForResult(intent, REQUEST_CODE_WRITE);
            }
        });

        Button menu03Btn = findViewById(R.id.btn_goal);
        menu03Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GoalActivity.class);
                intent.putExtra("titleMsg", "목표설정화면");
                startActivityForResult(intent, REQUEST_CODE_GOAL);
            }
        });

        Button menu04Btn = findViewById(R.id.btn_my);
        menu03Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity.class);
                intent.putExtra("titleMsg", "마이페이지화면");
                startActivityForResult(intent, REQUEST_CODE_MY);
            }
        });
    }

    /*
    Button button01 = findViewById(R.id.btn_reg);
    Button button02 = findViewById(R.id.btn_write);
    Button button03 = findViewById(R.id.btn_goal);
    Button button04 = findViewById(R.id.btn_my);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_search);
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WriteActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_write);
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GoalActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_goal);
            }
        });

        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyActivity.class);
                startActivity(intent);
                setContentView(R.layout.activity_my);
            }
        });
    }
     */
}