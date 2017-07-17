package com.mahmoud_ashraf.y_t_s_app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.mahmoud_ashraf.y_t_s_app.adapter.CustomAdapter;
import com.mahmoud_ashraf.y_t_s_app.model.movies;
import com.mahmoud_ashraf.y_t_s_app.webservices.WebService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private CustomAdapter adapter;
    private RecyclerView moviesList;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        WebService.getInstance().getApi().getListByPage(1).enqueue(new Callback<movies>() {
            @Override
            public void onResponse(Call<movies> call, Response<movies> response) {
                adapter = new CustomAdapter(response.body(), context);
                moviesList.setLayoutManager(new LinearLayoutManager(context));
                moviesList.setItemAnimator(new DefaultItemAnimator());
                moviesList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<movies> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("errr ", t.getMessage());

            }
        });
    }

    private void initView() {
        moviesList = (RecyclerView) findViewById(R.id.movies_list);
    }
}
