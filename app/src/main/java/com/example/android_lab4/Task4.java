package com.example.android_lab4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Task4 extends AppCompatActivity {
    private Button btn;
    private TextView textViewR;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);
        addListenerButton();
    }

    public void addListenerButton() {
        btn = (Button) findViewById(R.id.task4Button);
        textViewR = (TextView) findViewById(R.id.task4TextViewResult);
        editText = (EditText) findViewById(R.id.task4EditTextNumber);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {
                    textViewR.setText("is empty");
                    textViewR.setTextColor(Color.rgb(160, 0, 0));
                    textViewR.setTextSize(25);
                } else {
                    int evenNumber = 0;
                    int oddNumber = 0;
                    String century = editText.getText().toString();
                    char[] strToArray = century.toCharArray();
                    for (int i = 0; i < strToArray.length; i++) {
                        if (Integer.parseInt(String.valueOf(strToArray[i])) % 2 == 0) {
                            evenNumber++;
                        } else
                            oddNumber++;
                    }
                    textViewR.setText("Четных чисел: " + evenNumber + "\nНечетных чисел: " + oddNumber);
                    textViewR.setTextColor(Color.rgb(0, 160, 0));
                    textViewR.setTextSize(25);
                }
            }

        });
    }
}