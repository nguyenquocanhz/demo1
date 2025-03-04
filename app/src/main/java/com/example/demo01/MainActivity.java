package com.example.demo01;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ComplexAdapter adapter;
    List<Item> itemList;
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
//        RecyclerView recyclerView = findViewById(R.id.listItemView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        List<String> dataList = Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4");
//        MyAdapter adapter = new MyAdapter(dataList);
//        recyclerView.setAdapter(adapter);
        recyclerView = findViewById(R.id.listItemView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
// Tạo dữ liệu mẫu
        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.avt2, "Item 1","Kỹ thuật viên"));

// Thêm dữ liệu mẫu khác nếu cần...
// Khởi tạo Adapter và thiết lập cho RecyclerView
        adapter = new ComplexAdapter(itemList);
        recyclerView.setAdapter(adapter);

    }
//    public void StartRotation(int num,int vq){
//        ImageView imageView = findViewById(R.id.imageView);
//        ObjectAnimator rotation = ObjectAnimator.ofFloat(imageView, "rotation", 0, vq);
//        rotation.setDuration(num); // Thời gian xoay là 1 giây
//        rotation.start();
//    }
}