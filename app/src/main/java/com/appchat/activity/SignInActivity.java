package com.appchat.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.appchat.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignInActivity extends AppCompatActivity {

    @BindView(R.id.button_sign_up)
    Button btnSignUp;
    @BindView(R.id.textview_restore_password)
    TextView tvRestorePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_sign_in);
        ButterKnife.bind(this);

        btnSignUp.setOnClickListener(view ->
                startActivity(new Intent(SignInActivity.this,SignUpActivity.class)));

        tvRestorePassword.setOnClickListener(view ->
                startActivity(new Intent(SignInActivity.this,RestorePasswordActivity.class)));
    }
}