package com.example.user.sampleviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.sampleviewpager.fragment.FirstFragment;
import com.example.user.sampleviewpager.fragment.SecondFragment;
import com.example.user.sampleviewpager.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    MyPagerAdapter mAdapter;
    Button firstBtn, secondBtn, thirdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view initialize
        pager = (ViewPager) findViewById(R.id.pager);
        firstBtn = (Button) findViewById(R.id.first);
        secondBtn = (Button) findViewById(R.id.second);
        thirdBtn = (Button) findViewById(R.id.third);

        mAdapter = new MyPagerAdapter(getSupportFragmentManager());

        pager.setAdapter(mAdapter);

        mAdapter.add(new FirstFragment());
        mAdapter.add(new SecondFragment());
        mAdapter.add(new ThirdFragment());

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(0);
            }
        });

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(1);
            }
        });

        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(2);
            }
        });

    }
}
