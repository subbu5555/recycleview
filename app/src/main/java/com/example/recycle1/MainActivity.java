package com.example.recycle1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button b1;
RecyclerView recycleview;
    public String s1,s2,s3;

  public static   ArrayList<String> a1 =new ArrayList<String>();
   public static ArrayList<String> a2 =new ArrayList<String>();
    public static ArrayList<String> a3 =new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent= new Intent(MainActivity.this,MainActivity2.class);
              startActivity(intent);
          }
      });

      Intent i =getIntent();

      s1= i.getStringExtra("NAME");
      s2= i.getStringExtra("AGE");
      s3= i.getStringExtra("ROLLNO");
      a1.add(s1);
      a2.add(s2);
      a3.add(s3);
      String [] st1 = new String[a1.size()];
      st1=a1.toArray(st1);
        String [] st2 = new String[a2.size()];
        st2=a2.toArray(st2);
        String [] st3 = new String[a3.size()];
        st3=a3.toArray(st3);

     recycleview=findViewById(R.id.recyclerView);
      myadapter Myadapter = new myadapter(this,st1,st2,st3);
        recycleview.setAdapter(Myadapter);



      recycleview.setLayoutManager(new LinearLayoutManager(this));

    }

}