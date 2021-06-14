package com.df.whiskyhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.df.whiskyhunter.models.Whisky;

public class WhiskyDetail extends AppCompatActivity implements View.OnClickListener {

    TextView txtNameWhiskyDet;
    TextView txtSlugWhiskyDet;
    TextView txtBuyersFeeWhiskyDet;
    TextView txtSellersFeeWhiskyDet;
    TextView txtReserveFeeWhiskyDet;
    TextView txtListingFeeWhiskyDet;
    TextView txtBaseCurrencyWhiskyDet;
    Button btnVisite;
    String link;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky_detail);

        txtNameWhiskyDet = findViewById(R.id.txtNameWhiskyDet);
        txtSlugWhiskyDet = findViewById(R.id.txtSlugWhiskyDet);
        txtBuyersFeeWhiskyDet = findViewById(R.id.txtBuyersFeeWhiskyDet);
        txtSellersFeeWhiskyDet = findViewById(R.id.txtSellersFeeWhiskyDet);
        txtReserveFeeWhiskyDet = findViewById(R.id.txtReserveFeeWhiskyDet);
        txtListingFeeWhiskyDet = findViewById(R.id.txtListingFeeWhiskyDet);
        txtBaseCurrencyWhiskyDet = findViewById(R.id.txtBaseCurrencyWhiskyDet);
        btnVisite = findViewById(R.id.btnVisite);
        btnVisite.setOnClickListener(this);

        Whisky objWhisky = (Whisky) getIntent().getSerializableExtra("objectWhisky");
        txtNameWhiskyDet.setText(objWhisky.getNameWhisky());
        txtSlugWhiskyDet.setText(objWhisky.getSlugWhisky());
        txtBuyersFeeWhiskyDet.setText(objWhisky.getBuyersFeeWhisky());
        txtSellersFeeWhiskyDet.setText(objWhisky.getSellersFeeWhisky());
        txtReserveFeeWhiskyDet.setText(objWhisky.getReserveFeeWhisky());
        txtListingFeeWhiskyDet.setText(objWhisky.getListingFeeWhisky());
        txtBaseCurrencyWhiskyDet.setText(objWhisky.getBaseCurrencyWhisky());

        link = objWhisky.getUrlWhisky();
    }

    @Override
    public void onClick(View v) {
        
    }
}