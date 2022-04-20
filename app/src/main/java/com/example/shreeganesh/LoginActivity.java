package com.example.shreeganesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shreeganesh.model.User;
import com.example.shreeganesh.mydatabase.UserDatabase;

public class LoginActivity extends AppCompatActivity {
    EditText email = findViewById(R.id.emailBox);
    EditText password = (EditText) findViewById(R.id.passwordBox);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void clicked_Login(View view) {
        String emailString = String.valueOf(email.getText());
        String passwordString = String.valueOf(password.getText());
        User user = new User();
        user.setEmail(emailString);
        user.setPassword(passwordString);
        User uResponse=UserDatabase.loginUser(user);
    }

    public void clicked_SignUp(View view) {
        String emailString = String.valueOf(email.getText());
        String passwordString = String.valueOf(password.getText());
        User user = new User();
        user.setEmail(emailString);
        user.setPassword(passwordString);
        UserDatabase.createUser(user);
    }
}