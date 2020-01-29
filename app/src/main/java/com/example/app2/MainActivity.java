package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> mydata;
    Button add;
    RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.add);

        mydata = new ArrayList<>();
        mydata.add(new Book("1","1","1",R.drawable.b1));
        mydata.add(new Book("2","2","2",R.drawable.b2));
        mydata.add(new Book("3","3","3",R.drawable.b3));
        mydata.add(new Book("4","4","4",R.drawable.b4));
        mydata.add(new Book("5","5","5",R.drawable.b5));
        mydata.add(new Book("6","6","6",R.drawable.b6));
        mydata.add(new Book("7","7","7",R.drawable.b7));
        mydata.add(new Book("8","8","8",R.drawable.b8));
        mydata.add(new Book("9","9","9",R.drawable.b9));
        mydata.add(new Book("10","10","10",R.drawable.b10));

       final RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
       recyclerViewAdapter = new RecyclerViewAdapter(this,mydata);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(recyclerViewAdapter);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydata.add(new Book("10","10","10",R.drawable.b10));
                recyclerView.setAdapter(recyclerViewAdapter);
            }
        });


    }
}
