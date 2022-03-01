package com.example.android_lab4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Task3 extends AppCompatActivity {
    private Button btn;
    private TextView textViewR;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        addListenerButton();
    }

    public void addListenerButton() {
        btn = (Button) findViewById(R.id.task3Button);
        textViewR = (TextView) findViewById(R.id.task3TextViewResult);
        editText = (EditText) findViewById(R.id.task3EditTextNumber);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {
                    textViewR.setText("is empty");
                    textViewR.setTextColor(Color.rgb(160, 0, 0));
                    textViewR.setTextSize(25);
                } else {
                    int century = Integer.parseInt(editText.getText().toString());
                    century = ((century - 1) / 100) + 1;
                    textViewR.setText(Integer.toString(century));
                    textViewR.setTextColor(Color.rgb(0, 160, 0));
                    textViewR.setTextSize(25);
                }
            }

        });
    }
}