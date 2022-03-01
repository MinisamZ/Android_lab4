package com.example.android_lab4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Task2 extends AppCompatActivity {
    private Button btn;
    private TextView textViewR;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        addListenerButton();
    }

    public void addListenerButton() {
        btn = (Button) findViewById(R.id.task2Button);
        textViewR = (TextView) findViewById(R.id.task2textViewResult);
        editText = (EditText) findViewById(R.id.task2EditTextNumber);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int counter = 0;
                if (editText.getText().toString().isEmpty()) {
                    textViewR.setText("is empty");
                    textViewR.setTextColor(Color.rgb(160, 0, 0));
                    textViewR.setTextSize(25);
                } else {
                    long number = Long.parseLong(editText.getText().toString());
                    while (true) {
                        if (number == 0) {
                            textViewR.setText("Количество десятичных \nчисел равно: " + Integer.toString(counter));
                            textViewR.setTextSize(20);
                            break;
                        }
                        number = number / 10;
                        counter++;
                    }
                }

            }

        });
    }
}