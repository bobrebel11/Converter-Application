package com.example.rebelbob11.juneassignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.rebelbob11.juneassignment.fragments.fragment_area;
import com.example.rebelbob11.juneassignment.fragments.fragment_length;
import com.example.rebelbob11.juneassignment.fragments.fragment_temperature;
import com.example.rebelbob11.juneassignment.fragments.fragment_time;
import com.example.rebelbob11.juneassignment.fragments.fragment_volume;
import com.example.rebelbob11.juneassignment.fragments.fragment_weight;

public class conversion_center extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversion_center);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.AddFragment(new fragment_length(),"");
        adapter.AddFragment(new fragment_temperature(),"");
        adapter.AddFragment(new fragment_area(),"");
        adapter.AddFragment(new fragment_volume(),"");
        adapter.AddFragment(new fragment_weight(),"");
        adapter.AddFragment(new fragment_time(),"");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_length);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_temperature);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_area);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_volume);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_weight);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_time);

    }
}
