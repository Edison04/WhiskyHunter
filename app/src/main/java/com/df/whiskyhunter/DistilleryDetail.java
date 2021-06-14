package com.df.whiskyhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.df.whiskyhunter.models.Distillery;

public class DistilleryDetail extends AppCompatActivity {

    TextView txtNameDistilleryDet;
    TextView txtSlugDistilleryDet;
    TextView txtCountryDistilleryDet;
    TextView txtWhiskiesDistilleryDet;
    TextView txtVotesDistilleryDet;
    TextView txtRatingDistilleryDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distillery_detail);

        txtNameDistilleryDet = findViewById(R.id.txtNameDistilleryDet);
        txtSlugDistilleryDet = findViewById(R.id.txtSlugDistilleryDet);
        txtCountryDistilleryDet = findViewById(R.id.txtCountryDistilleryDet);
        txtWhiskiesDistilleryDet = findViewById(R.id.txtWhiskiesDistilleryDet);
        txtVotesDistilleryDet = findViewById(R.id.txtVotesDistilleryDet);
        txtRatingDistilleryDet = findViewById(R.id.txtRatingDistilleryDet);

        Distillery distillery = (Distillery) getIntent().getSerializableExtra("objectDistillery");

        txtNameDistilleryDet.setText(distillery.getNameDistillery());
        txtSlugDistilleryDet.setText(distillery.getSlugDistillery());
        txtCountryDistilleryDet.setText(distillery.getCountryDistillery());
        txtWhiskiesDistilleryDet.setText(distillery.getWhiskybase_whiskiesDistillery());
        txtVotesDistilleryDet.setText(distillery.getWhiskybase_votesDistillery());
        txtRatingDistilleryDet.setText(distillery.getWhiskybase_ratingDistillery());
    }
}