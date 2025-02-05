package com.example.converter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textview);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(v -> {
            String text = editText.getText().toString();
            if (text.isEmpty()) {
                textView.setText("Please enter a number");
                return;
            }
            double kg = Double.parseDouble(text);
            double pounds = kg * 2.20462;
            textView.setText(pounds + " pounds");
        });
    }
}