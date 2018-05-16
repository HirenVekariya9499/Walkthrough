package com.vinit.walkthrough;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class WalkthroughActivity extends AppCompatActivity {

    private ViewPager mpager;
    private MpagerAdapter mpagerAdapter;
    private int[] layouts = {R.id.first_slide,R.id.second_slide,R.id.third_slide,R.id.fourth_slide};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        mpager = (ViewPager)findViewById(R.id.viewPager);
        mpagerAdapter = new MpagerAdapter(layouts,this);
        mpager.setAdapter(mpagerAdapter);

    }
}
