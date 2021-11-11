package com.example.booklogapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.booklogapp.Database.BookMemo;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WriteActivity extends AppCompatActivity {

    // 파이어베이스 db연동
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    // 데이터베이스의 특정 위치로 연결
    private DatabaseReference MemoDatabaseRef = database.getReference("bookmemo");

    Button memo_btn;
    EditText w_title, w_author, w_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        memo_btn = findViewById(R.id.memo_btn);
        w_title = findViewById(R.id.w_title);
        w_author = findViewById(R.id.w_author);
        w_content = findViewById(R.id.w_content);

        // 버튼 누르면 값 저장
        memo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMemo(w_title.getText().toString(), w_author.getText().toString(), w_content.getText().toString());
            }
        });
    }

    public void addMemo(String title, String author, String content) {
        BookMemo memo = new BookMemo(title, author, content);
        MemoDatabaseRef.child("memo").child(title).setValue(memo);
    }
}