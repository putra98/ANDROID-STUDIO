package com.example.fragmenapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);

        Log.v( tag: "CREATING", msg: "SECOND ACTIVITY");
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
        if(savedInstancesState == null){
            SecondFragment details = new SecondFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();

        }
    }
}
