package com.df.whiskyhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.whiskyhunter.ApiManager.RetrofitClient;
import com.df.whiskyhunter.models.Distillery;

import java.util.List;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Distilleries extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listDistilleries;
    List<Distillery> myDistilleries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distilleries);

        listDistilleries = findViewById(R.id.lvDistilleries);
        getDistilleriesFromApi();
        listDistilleries.setOnItemClickListener(this);
    }

    private void getDistilleriesFromApi() {
        Call<List<Distillery>> call = RetrofitClient.getInstance().getMyApi().getDistilleries();
        call.enqueue(new Callback<List<Distillery>>() {
            @Override
            public void onResponse(Call<List<Distillery>> call, Response<List<Distillery>> response) {
                myDistilleries = response.body();
                DistilleryAdapter adapter = new DistilleryAdapter(Distilleries.this, myDistilleries);
                listDistilleries.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Distillery>> call, Throwable t) {

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, DistilleryDetail.class);
        intent.putExtra("objectDistillery", myDistilleries.get(position));
        startActivity(intent);
    }
}