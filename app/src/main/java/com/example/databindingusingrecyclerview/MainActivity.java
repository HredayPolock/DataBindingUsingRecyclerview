package com.example.databindingusingrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.RecyclerAdapter;
import com.example.UserList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<UserList> userLists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userLists = new ArrayList<>();

        recyclerView = findViewById(R.id.recycleid);

        recyclerAdapter = new RecyclerAdapter(getUser());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(recyclerAdapter);


    }

    private List<UserList> getUser() {


        List<UserList> userLists = new ArrayList<>();
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));
        userLists.add(new UserList("Hreday", 25, true, "https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg"));

        return userLists;
    }
}