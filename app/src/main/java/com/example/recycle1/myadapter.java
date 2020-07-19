package com.example.recycle1;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.MyViewHolder> {
    String data1[],data2[],data3[];
    Context context;
    public static final int i=0;
    public myadapter(Context ct,String st1[] , String st2[] , String st3[])
    {
        context=ct;
        data1=st1;
        data2=st2;
        data3=st3;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
       View view= inflater.inflate(R.layout.myrow,parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder ,int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.t3.setText(data3[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.mt1);
            t2=itemView.findViewById(R.id.mt2);
            t3=itemView.findViewById(R.id.mt3);
        }
    }
}
