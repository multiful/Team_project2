package com.professionalandroid.apps.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class homeActivity extends AppCompatActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home);

        ImageButton egHallButton = (ImageButton) findViewById(R.id.egHallButton);
        TextView info_egHall =(TextView) findViewById(R.id.info_egHall);
        Button in_egHallButton =(Button) findViewById(R.id.in_egHallButton);

        ImageButton ctHallButton = (ImageButton) findViewById(R.id.ctHallButton);
        TextView info_ctHall =(TextView) findViewById(R.id.info_ctHall);
        Button in_ctHallButton =(Button) findViewById(R.id.in_ctHallButton);

        ImageButton lbHallButton = (ImageButton) findViewById(R.id.lbHallButton);
        TextView info_lbHall =(TextView) findViewById(R.id.info_lbHall);
        Button in_lbHallButton =(Button) findViewById(R.id.in_lbHallButton);

        ImageButton lgHallButton = (ImageButton) findViewById(R.id.lgHallButton);
        TextView info_lgHall =(TextView) findViewById(R.id.info_lgHall);
        Button in_lgHallButton =(Button) findViewById(R.id.in_lgHallButton);
        
        
        egHallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_ctHall.setVisibility(View.GONE);
                info_lbHall.setVisibility(View.GONE);
                info_lgHall.setVisibility(View.GONE);
                info_egHall.setVisibility(View.VISIBLE);
                in_lgHallButton.setVisibility(View.GONE);
                in_ctHallButton.setVisibility(View.GONE);
                in_lbHallButton.setVisibility(View.GONE);
                in_egHallButton.setVisibility(View.VISIBLE);
            }
        });
        ctHallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_egHall.setVisibility(View.GONE);
                info_lbHall.setVisibility(View.GONE);
                info_lgHall.setVisibility(View.GONE);
                info_ctHall.setVisibility(View.VISIBLE);
                in_lgHallButton.setVisibility(View.GONE);
                in_egHallButton.setVisibility(View.GONE);
                in_lbHallButton.setVisibility(View.GONE);
                in_ctHallButton.setVisibility(View.VISIBLE);
            }
        });
        lbHallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_egHall.setVisibility(View.GONE);
                info_ctHall.setVisibility(View.GONE);
                info_lgHall.setVisibility(View.GONE);
                info_lbHall.setVisibility(View.VISIBLE);
                in_lgHallButton.setVisibility(View.GONE);
                in_ctHallButton.setVisibility(View.GONE);
                in_egHallButton.setVisibility(View.GONE);
                in_lbHallButton.setVisibility(View.VISIBLE);
            }
        });
        

        lgHallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_egHall.setVisibility(View.GONE);
                info_lbHall.setVisibility(View.GONE);
                info_ctHall.setVisibility(View.GONE);
                info_lgHall.setVisibility(View.VISIBLE);
                in_egHallButton.setVisibility(View.GONE);
                in_ctHallButton.setVisibility(View.GONE);
                in_lbHallButton.setVisibility(View.GONE);
                in_lgHallButton.setVisibility(View.VISIBLE);
            }
        });
    }
}
