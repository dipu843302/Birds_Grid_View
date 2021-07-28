package com.example.birds_grid_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdsAdapter extends RecyclerView.Adapter<BirdsViewHolder> {
public ArrayList<ModelClass> arrayList;
private ItemClickListner itemClickListner;
    public BirdsAdapter(ArrayList<ModelClass> arrayList,ItemClickListner itemClickListner) {
        this.arrayList = arrayList;
        this.itemClickListner=itemClickListner;
    }

    @Override
    public BirdsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.birds_item,parent,false);
        return new BirdsViewHolder(view,itemClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull  BirdsViewHolder holder, int position) {
      ModelClass modelClass=arrayList.get(position);
      holder.setData(modelClass,position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
