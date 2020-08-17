package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivitygim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingim);
    }
    public void shoppingCart(View view){
        Intent intent1= new Intent(this, MainActivity2gim.class);
        startActivity(intent1);
    }
}