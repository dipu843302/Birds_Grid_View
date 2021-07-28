package com.example.birds_grid_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdsViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    private ItemClickListner itemClickListner;
    private RelativeLayout relativeLayout;
    public BirdsViewHolder(@NonNull  View itemView,ItemClickListner itemClickListner) {
        super(itemView);
        this.itemClickListner=itemClickListner;
        initViews(itemView);


    }

     public void setData(ModelClass modelClass, int position) {
        textView.setText(modelClass.getText());
        imageView.setImageResource(modelClass.getImage());
         relativeLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 itemClickListner.onItemClicked(getAdapterPosition(),modelClass);
             }
         });
    }

    private void initViews(View itemView) {
        textView=itemView.findViewById(R.id.text);
        imageView=itemView.findViewById(R.id.image);
        relativeLayout=itemView.findViewById(R.id.rvcard);

    }
}
