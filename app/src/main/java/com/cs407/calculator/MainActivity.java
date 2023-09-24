package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunction(View view) {
        EditText numOne = (EditText) findViewById(R.id.myTextField2);
        EditText numTwo = (EditText) findViewById(R.id.myTextField);

        String numOneStr = numOne.getText().toString();
        String numTwoStr = numTwo.getText().toString();

        if (!numOneStr.isEmpty() && !numTwoStr.isEmpty()) {
            int firstNum = Integer.parseInt(numOneStr);
            int secondNum = Integer.parseInt(numTwoStr);
            int sum = firstNum + secondNum;

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", String.valueOf(sum));
            startActivity(intent);
        }
    }
    public void subtractFunction(View view) {
        EditText numOne = (EditText) findViewById(R.id.myTextField2);
        EditText numTwo = (EditText) findViewById(R.id.myTextField);

        String numOneStr = numOne.getText().toString();
        String numTwoStr = numTwo.getText().toString();

        if (!numOneStr.isEmpty() && !numTwoStr.isEmpty()) {
            int firstNum = Integer.parseInt(numOneStr);
            int secondNum = Integer.parseInt(numTwoStr);
            int sum = firstNum - secondNum;

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", String.valueOf(sum));
            startActivity(intent);
        }
    }
    public void multiplyFunction(View view) {
        EditText numOne = (EditText) findViewById(R.id.myTextField2);
        EditText numTwo = (EditText) findViewById(R.id.myTextField);

        String numOneStr = numOne.getText().toString();
        String numTwoStr = numTwo.getText().toString();

        if (!numOneStr.isEmpty() && !numTwoStr.isEmpty()) {
            int firstNum = Integer.parseInt(numOneStr);
            int secondNum = Integer.parseInt(numTwoStr);
            int sum = firstNum * secondNum;

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result", String.valueOf(sum));
            startActivity(intent);
        }
    }
    public void divideFunction(View view) {
        EditText numOne = (EditText) findViewById(R.id.myTextField2);
        EditText numTwo = (EditText) findViewById(R.id.myTextField);

        String numOneStr = numOne.getText().toString();
        String numTwoStr = numTwo.getText().toString();

        if (!numOneStr.isEmpty() && !numTwoStr.isEmpty()) {
            int firstNum = Integer.parseInt(numOneStr);
            int secondNum = Integer.parseInt(numTwoStr);

            if (secondNum != 0) {
                int sum = firstNum / secondNum;
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", String.valueOf(sum));
                startActivity(intent);
            } else {
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("result", "Division by 0 not allowed");
                startActivity(intent);
            }
        }
    }
}