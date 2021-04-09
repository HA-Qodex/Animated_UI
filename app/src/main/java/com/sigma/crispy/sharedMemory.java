package com.sigma.crispy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class sharedMemory {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private int mode = 0;
    private String value = "b";
    private String KEY = "userData";
    private Context context;

    public sharedMemory(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(KEY, mode);
        editor = sharedPreferences.edit();
    }

    public void signIn(){
        editor.putBoolean(value, true);
        editor.commit();
    }

    public void checkUser(){
        if (!this.login()){
            Intent intent = new Intent(context, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            context.startActivity(intent);
        }
    }

    private boolean login(){
        return sharedPreferences.getBoolean(value, false);
    }

    public void logout(){
        editor.clear();
        editor.apply();
    }

}
