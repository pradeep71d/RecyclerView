package com.example.example7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<Student>arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        Student s1=new Student();
        s1.setImage(R.mipmap.ic_launcher);
        s1.setNem("anil");
        s1.setEmail("anil@abc.com");
        Student s2=new Student();
        s2.setImage(R.mipmap.ic_launcher);
        s2.setNem("Nitish");
        s2.setEmail("ac@dyz.com");
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s1);
        arrayList.add(s1);
        arrayList.add(s1);
        arrayList.add(s1);
        arrayList.add(s1);
        arrayList.add(s1);
        arrayList.add(s1);
        arrayList.add(s1);
        MyAdapter obj=new MyAdapter(this,R.layout.cardview,arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(obj);
    }
}
