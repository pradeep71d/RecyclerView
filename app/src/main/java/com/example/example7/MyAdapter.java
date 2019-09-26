package com.example.example7;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
        Activity obj;
    int res;
    ArrayList<Student> Al = new ArrayList<>();

    public MyAdapter(Activity obj, int res, ArrayList<Student> Al) {
        this.obj = obj;
        this.res = res;
        this.Al = Al;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(obj).inflate(res, viewGroup, false);
        MyHolder myHolder = new MyHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        Student s2 = Al.get(i);
        myHolder.im.setImageResource(s2.getImage());
        myHolder.tv1.setText(s2.getNem());
        myHolder.tv2.setText(s2.getEmail());
    }

    @Override
    public int getItemCount() {
        return Al.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView tv1, tv2;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            im = itemView.findViewById(R.id.iv1);
            tv1 = itemView.findViewById(R.id.tv_nem);
            tv2 = itemView.findViewById(R.id.tv_email);
        }
    }
}