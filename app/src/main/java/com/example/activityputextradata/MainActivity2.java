package com.example.activityputextradata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editTextTextPersonName2);
        String data = getIntent().getStringExtra("data");
        editText.setText(data);
    }

    public void goToMainActivity(View view){
        String message = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("data", message);
        startActivity(intent);
    }
}