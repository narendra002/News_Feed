package com.example.newsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
String api="540948aa84cb47dda44582a582ac501c";
PagerAdapter pagerAdapter;
TextView mhome,science,sports,technology,entertainment,health;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar mtoolbar = findViewById(R.id.toolbar);
       TabLayout tabLayout=findViewById(R.id.include);
       setSupportActionBar(mtoolbar);
       mhome=findViewById(R.id.home);
       science=findViewById(R.id.Science);
       sports=findViewById(R.id.sports);
       technology=findViewById(R.id.technology);
       entertainment=findViewById(R.id.Entertainment);
       health=findViewById(R.id.health);
        ViewPager viewPager=findViewById(R.id.fragementcontainer);
        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}