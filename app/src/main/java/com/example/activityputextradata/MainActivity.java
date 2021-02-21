package com.example.activityputextradata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        String data = getIntent().getStringExtra("data");
        editText.setText(data);
    }

    public void goToSecondActivity(View view){
        String message = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("data", message);
        startActivity(intent);
    }
}