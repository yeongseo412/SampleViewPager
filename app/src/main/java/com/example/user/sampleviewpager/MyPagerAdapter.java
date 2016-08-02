package com.example.user.sampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2016-08-02.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter{
// Ctrl + I, Ctrl + O

    List<Fragment> items = new ArrayList<>();

    // Adapter 에 add 를 통해서 fragment 를 넣어준다.
    public void add(Fragment f) {
        items.add(f);

        notifyDataSetChanged();
    }

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
