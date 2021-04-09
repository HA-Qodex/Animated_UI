package com.sigma.crispy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView pizza, burger, fries, chicken, cake, noodles, hotdog, softDrink;
    private float a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewPager = findViewById(R.id.loginViewPager_Id);
        tabLayout = findViewById(R.id.loginTabLayout_Id);

        pizza = findViewById(R.id.pizza_Id);
        burger = findViewById(R.id.burger_Id);
        fries = findViewById(R.id.fries_Id);
        chicken = findViewById(R.id.chickenFry_Id);
        cake = findViewById(R.id.cake_Id);
        noodles = findViewById(R.id.noodles_Id);
        hotdog = findViewById(R.id.hotDog_Id);
        softDrink = findViewById(R.id.softDrink_Id);


        tabAdapter adapter = new tabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



        pizza.setTranslationX(1000);
        burger.setTranslationX(1000);
        fries.setTranslationX(1000);
        cake.setTranslationX(1000);
        chicken.setTranslationX(1000);
        noodles.setTranslationX(1000);
        hotdog.setTranslationX(1000);
        softDrink.setTranslationX(1000);

        pizza.setAlpha(a);
        burger.setAlpha(a);
        fries.setAlpha(a);
        cake.setAlpha(a);
        chicken.setAlpha(a);
        noodles.setAlpha(a);
        hotdog.setAlpha(a);
        softDrink.setAlpha(a);

        pizza.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(300).start();
        burger.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(800).start();
        fries.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(800).start();
        cake.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(1000).start();
        chicken.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(1000).start();
        noodles.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(1500).start();
        hotdog.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(1500).start();
        softDrink.animate().translationX(0).alpha(1).setDuration(2000).setStartDelay(1500).start();

    }
}