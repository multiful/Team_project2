package com.professionalandroid.apps.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class startActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_story);
        TextView userName =(TextView) findViewById(R.id.userName);
        Intent intent =getIntent();
        String name =intent.getStringExtra("userName");
        userName.setText(name);
    }

}
