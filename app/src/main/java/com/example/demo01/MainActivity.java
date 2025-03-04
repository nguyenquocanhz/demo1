package com.example.demo01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView recyclerView = findViewById(R.id.listItemView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> dataList = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");
        MyAdapter adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
    public void InitRecyclerView(){


    }
//    public void StartRotation(int num,int vq){
//        ImageView imageView = findViewById(R.id.imageView);
//        ObjectAnimator rotation = ObjectAnimator.ofFloat(imageView, "rotation", 0, vq);
//        rotation.setDuration(num); // Thời gian xoay là 1 giây
//        rotation.start();
//    }
}