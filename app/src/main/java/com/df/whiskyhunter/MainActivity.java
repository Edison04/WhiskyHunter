package com.df.whiskyhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.whiskyhunter.ApiManager.RetrofitClient;
import com.df.whiskyhunter.models.Whisky;

import java.util.List;

import es.dmoral.toasty.Toasty;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listWhisky;
    List<Whisky> myWhisky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listWhisky = findViewById(R.id.lvWhiskys);
        getWhiskysFromApi();
        listWhisky.setOnItemClickListener(this);
    }

    private void getWhiskysFromApi() {
        Call<List<Whisky>> call = RetrofitClient.getInstance().getMyApi().getWhiskys();
        call.enqueue(new Callback<List<Whisky>>() {
            @Override
            public void onResponse(Call<List<Whisky>> call, Response<List<Whisky>> response) {
                myWhisky = response.body();
                WhiskyAdapter adapter = new WhiskyAdapter(MainActivity.this, myWhisky);
                listWhisky.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Whisky>> call, Throwable t) {
                Toasty.error(getApplicationContext(), "Se produjo un error", Toast.LENGTH_SHORT, true).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, WhiskyDetail.class);
        intent.putExtra("objectWhisky", myWhisky.get(position));
        startActivity(intent);
    }
}