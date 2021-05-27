package com.example.appcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<DataClass> list;
    RecyclerViewAdapter(List<DataClass> myList){
        list = myList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        DataClass data = list.get(position);
        holder.Name.setText(data.name);
        holder.MobileNo.setText(data.mob);
        holder.ImageView.setBackgroundResource(data.img_name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView Name;
        TextView MobileNo;
        ImageView ImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.Name);
            MobileNo = itemView.findViewById(R.id.MobileNo);
            ImageView = itemView.findViewById(R.id.ImageView);

        }
    }
}
