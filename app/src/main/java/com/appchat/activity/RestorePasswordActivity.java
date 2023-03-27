package com.appchat.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.Button;

import com.appchat.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RestorePasswordActivity extends AppCompatActivity {

    @BindView(R.id.button_back)
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_restore_password);
        ButterKnife.bind(this);
        btnBack.setOnClickListener(view -> onBackPressed());
    }
}