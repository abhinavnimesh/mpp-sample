package com.animator_abhi.mvpsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity implements LoginView,View.OnClickListener{
    EditText username,password;
    Button login;
    ProgressBar pb;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username= (EditText) findViewById(R.id.editTextName);
        password= (EditText) findViewById(R.id.editTextPassword);
        login= (Button) findViewById(R.id.login);
        pb= (ProgressBar) findViewById(R.id.progressBar1);
        login.setOnClickListener(this);

        presenter=new LoginPresenterImp(this);
    }

    @Override
    protected void onDestroy() {
        presenter.Destroy();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        presenter.validateCredentials(username.getText().toString(),password.getText().toString());

    }

    @Override
    public void showProgress() {

        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {

        pb.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showUserNameError() {
         username.setError("username cannot be empty");

    }

    @Override
    public void showPasswordError() {

        password.setError("password cannot be empty");
    }

    @Override
    public void navigateToHome() {

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
