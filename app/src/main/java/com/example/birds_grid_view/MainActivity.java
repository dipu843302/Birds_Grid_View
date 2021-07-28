package com.example.birds_grid_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListner{
private RecyclerView recyclerView;
private ArrayList<ModelClass>arrayList=new ArrayList<>();
private BirdsAdapter birdsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
       buildList();
       setRecyclerView();
    }

    private void setRecyclerView() {
        birdsAdapter=new BirdsAdapter(arrayList,this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,4);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(birdsAdapter);
    }

    private void buildList() {
       for (int i=0;i<69;i++){
         if (i%4==0){
             arrayList.add(new ModelClass(R.drawable.eagle,"Eagle"));
         }else if (i%4==1){
             arrayList.add(new ModelClass(R.drawable.crow,"Crow"));
         }else {
             arrayList.add(new ModelClass(R.drawable.sparrow,"Sparrow"));
             arrayList.add(new ModelClass(R.drawable.swan,"Swan"));
         }

       }
    }

         public void onItemClicked(int position,ModelClass modelClass){
    Toast.makeText(MainActivity.this, "Birds position "+position +" Birds name "+modelClass.getText(),Toast.LENGTH_LONG).show();
}
}