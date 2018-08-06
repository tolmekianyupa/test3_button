package com.example.kusyana1.test3_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;
    private int  times = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ボタンを設定
        API Level 26から総称型対応となりました。
        */
        textView = findViewById(R.id.text_view);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //flagがtrueの時
                if (flag) {
                    textView.setText("Hello");
                    flag = false;
                } else {
                    textView.setText("World");


                    flag = true;
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                times ++;
                textView.setText(String.valueOf(times));
            }
        });
    }

}
