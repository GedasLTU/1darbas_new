package com.example.a1darbas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = findViewById(R. id. textView);
    }

    public void spustelejus(View view) {
        this.textView.setText("labas");
    }

    public void nuspalvoti(View view) {
        this.textView.setTextColor(Color.parseColor("#FF0000"));
    }
}