package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2gim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2gim);
    }
    public void shoppingCart(View view){
        Intent intent2= new Intent(this, MainActivity3gim.class);
        startActivity(intent2);
    }
}