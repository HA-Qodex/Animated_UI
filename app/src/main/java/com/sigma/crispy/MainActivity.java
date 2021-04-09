package com.sigma.crispy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private ChipNavigationBar navigationBar;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationBar = findViewById(R.id.bottomNavi_Id);
        frameLayout = findViewById(R.id.frameLayout_Id);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_Id, new HomeFragment()).commit();

        navigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment selectedFragment = null;
                switch (i){
                    case R.id.home_Id:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.order_Id:
                        selectedFragment = new OrderFragment();
                        break;
                    case R.id.notification_Id:
                        selectedFragment = new NotificationFragment();
                        break;
                    case R.id.settings_Id:
                        selectedFragment = new SettingsFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_Id, selectedFragment).commit();
            }
        });

    }
}