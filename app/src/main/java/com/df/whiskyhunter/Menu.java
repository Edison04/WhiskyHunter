package com.df.whiskyhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private Button btnWhiskys;
    private Button btnDistilleries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnWhiskys = findViewById(R.id.btnWhiskys);
        btnDistilleries = findViewById(R.id.btnDistilleries);

        btnWhiskys.setOnClickListener(this);
        btnDistilleries.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnWhiskys) {
            Intent intentWhisky = new Intent(this, MainActivity.class);
            startActivity(intentWhisky);
        } else {
            Intent intentDistilleries = new Intent(this, Distilleries.class);
            startActivity(intentDistilleries);
        }
    }
}