package com.example.newsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Homefragment extends Fragment {
    String api="540948aa84cb47dda44582a582ac501c";
    ArrayList<ModelClass> modelClassArrayList;
    Adapter adapter;
    RecyclerView recyclerView;String country="in";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.homefragment,null);

        recyclerView=view.findViewById(R.id.recyvlerviewofhome);
    modelClassArrayList=new ArrayList<>();
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    adapter=new Adapter(getContext(),modelClassArrayList);
    recyclerView.setAdapter(adapter);
    findNews();
        return view;

    }

    private void findNews() {
        ApiUtilities.getApiINterface().getnews(country,100,api).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                modelClassArrayList.addAll(response.body().getArticles());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }
}
