package com.sigma.crispy;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class loginFragment extends Fragment implements View.OnClickListener{

    private EditText email, password;
    private Drawable validity;
    private String userEmail, userPassword;
    private Button forgotPasswordButton, loginButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        email = view.findViewById(R.id.email_Id);
        password = view.findViewById(R.id.password_Id);
        forgotPasswordButton = view.findViewById(R.id.forgotPassword_Id);
        loginButton = view.findViewById(R.id.loginButton_Id);


        loginButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.loginButton_Id) {

            startActivity(new Intent(getContext(), MainActivity.class));
        }

    }
}