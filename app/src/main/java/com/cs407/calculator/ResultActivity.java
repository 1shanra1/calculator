package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        String result = getIntent().getStringExtra("result");
        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(result);
    }
}