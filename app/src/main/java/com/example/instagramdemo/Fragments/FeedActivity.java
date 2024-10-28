package com.example.instagramdemo.Fragments;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramdemo.Controller.UserAdapter;
import com.example.instagramdemo.Model.UserModel;
import com.example.instagramdemo.R;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserAdapter userAdapter;
    ArrayList<UserModel> userModels;
    private Context getApplicationContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_feed);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.recyclearview);
        userModels=new ArrayList<>();

        userModels.add(new UserModel("AB","mypic2"));
        userModels.add(new UserModel("AB Siddiqe","mountains"));

        userAdapter=new UserAdapter(getApplicationContext,this,userModels);
        recyclerView.setAdapter(userAdapter);
    }
}