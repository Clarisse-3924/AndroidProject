package com.example.smartbabies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;

public class Login extends AppCompatActivity {


    create= findViewById(R.id.textView7);
    login = findViewById(R.id.button2);
    fAuth=FirebaseAuth.getInstance();

    progressBar = findViewById(R.id.progressBar2);

    @BindView(R.id.email1) EditText textEmail;
    @BindView(R.id.textView7) TextView  create;
    @BindView(R.id.Pass) EditText  textpass;
    @BindView(R.id.button2) EditText   login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}