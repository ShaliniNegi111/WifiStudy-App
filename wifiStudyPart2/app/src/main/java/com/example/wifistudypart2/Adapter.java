package com.example.wifistudypart2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends  RecyclerView.Adapter<Adapter.MyViewHolder>
{

    List< ModelClass> modelClassList ;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout , parent , false);
        return new MyViewHolder( view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        int resource = modelClassList.get( position).getImageresource();
        String text = modelClassList.get( position).getTiltle() ;
        String body = modelClassList.get(position).getText();
        holder.setdata(resource , text , body );
    }

    @Override
    public int getItemCount()
    {
        return modelClassList.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder
    {

        private ImageView imageView ;
        private TextView textView ;
        private  TextView textView1 ;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView2) ;
            textView = itemView.findViewById(R.id.textView2);
            textView1 = itemView.findViewById(R.id.textView3);

        }

        private void setdata ( int resource , String text , String body )
        {
            imageView.setImageResource(resource);
            textView.setText(text);
            textView1.setText(body);
        }
    }
}
