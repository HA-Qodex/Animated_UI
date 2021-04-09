package com.sigma.crispy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class tabAdapter extends FragmentPagerAdapter {

    private String[] pageTitle = {"Login","Signup"};

    public tabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new loginFragment();
            case 1: return new signUpFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return pageTitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitle[position];
    }
}
