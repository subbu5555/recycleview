package com.example.recycle1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    Button b2;
    TextView t1,t2,t3,t;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
        t3=findViewById(R.id.tv3);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        t=findViewById(R.id.tv);
      b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name =e1.getText().toString();
                String age =e2.getText().toString();
                String rollno =e3.getText().toString();
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                i.putExtra("NAME",name);
                i.putExtra("AGE",age);
                i.putExtra("ROLLNO",rollno);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(j);
            }
        });

    }
}