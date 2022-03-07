package com.example.parcelable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.parcelable.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {

        EditText nameText = findViewById(R.id.name);
        EditText emailText = findViewById(R.id.email);
        EditText ageText = findViewById(R.id.age);

        String name = nameText.getText().toString();
        String email = emailText.getText().toString();
//        int age = Integer.parseInt(ageText.getText().toString());

        User user = new User(name, email);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(User.class.getSimpleName(), user);
        startActivity(intent);
    }
}
