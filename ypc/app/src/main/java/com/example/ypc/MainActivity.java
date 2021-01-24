package com.example.ypc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
 Toast.makeText(MainActivity.this,"你点击了注册",Toast.LENGTH_SHORT).show();
        }
       });
   }
}
