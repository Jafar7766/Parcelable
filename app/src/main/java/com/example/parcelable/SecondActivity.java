package com.example.parcelable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.parcelable.model.User;

public class SecondActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setPadding(22, 20, 20, 20);

        Bundle arguments = getIntent().getExtras();

        User user;
        if(arguments!=null){
            user = arguments.getParcelable(User.class.getSimpleName());
            textView.setText("Name: " + user.getName() + "\nCompany: " + user.getEmail() +
//                    "\nAge: " + user.getAge());
        }
        setContentView(textView);

    }
}

