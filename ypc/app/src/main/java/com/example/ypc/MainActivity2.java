package com.example.ypc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ypc=new AlertDialog.Builder(MainActivity2.this);
                ypc.setTitle("对话框");
                ypc.setMessage("温馨提示，确定删除");
                ypc.setPositiveButton("ok",null);
                ypc.setNegativeButton("yes",null);
                ypc.show();
            }
        });
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder y1=new AlertDialog.Builder(MainActivity2.this);
               y1.setTitle("") ;//
                y1.setMessage("");
                y1.setNegativeButton("ok",null);
                y1.setPositiveButton("yes",null);
                y1.show();
            }
        });
    }
}
