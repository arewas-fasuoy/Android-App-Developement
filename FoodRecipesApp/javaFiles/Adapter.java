package com.example.foodapp;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater inflater;
    private String[] Fitems;
    private String[] Fdetails;
    Adapter(Context context, String[] items,String[] details){
        this.inflater=LayoutInflater.from(context);
        this.Fitems=items;
        this.Fdetails=details;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=inflater.inflate(R.layout.custom_view,viewGroup,false );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String item=Fitems[i];
        String detail=Fdetails[i];
        viewHolder.textView.setText(item);
        viewHolder.textView1.setText(detail);
    }

    @Override
    public int getItemCount() {
        return Fitems.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView,textView1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(view.getContext(),Details.class);
                    i.putExtra("titleOfFood",Fitems[getAdapterPosition()]);
                    i.putExtra("detailOfFood",Fdetails[getAdapterPosition()]);
                    view.getContext().startActivity(i);
                }
            });
            textView=itemView.findViewById(R.id.textView);
            textView1=itemView.findViewById(R.id.textView1);
        }
    }
}
