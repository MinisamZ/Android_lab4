package com.example.android_lab4;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Task1 extends AppCompatActivity {
    private Button btn;
    private TextView textViewR1, textViewR2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        textViewR1 = (TextView) findViewById(R.id.task1TextView2);
        textViewR2 = (TextView) findViewById(R.id.task1TextView3);
        btn = (Button) findViewById(R.id.task1Button);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                textViewR2.setText("Не кратно");
                textViewR2.setTextColor(Color.rgb(160, 0, 0));
                textViewR2.setTextSize(25);

//                double number = Double.parseDouble(field1.getText().toString());
                Random rnd = new Random();
                int a = rnd.nextInt(99) + 1;
                textViewR1.setText(Integer.toString(a));
//                textView.setText(Double.toString(number));
                textViewR1.setTextColor(Color.rgb(0, 160, 0));
                textViewR1.setTextSize(25);
                if (a % 5 == 0 && a % 3 == 0) {
                    textViewR2.setText("Кратно 5 и 3");
                    textViewR2.setTextColor(Color.rgb(0, 160, 0));
                    textViewR2.setTextSize(25);
                } else if (a % 5 == 0) {
                    textViewR2.setText("Кратно 5");
                    textViewR2.setTextColor(Color.rgb(0, 160, 0));
                    textViewR2.setTextSize(25);

                } else if (a % 3 == 0) {
                    textViewR2.setText("Кратно 3");
                    textViewR2.setTextColor(Color.rgb(0, 160, 0));
                    textViewR2.setTextSize(25);

                }


            }
        });

    }
}