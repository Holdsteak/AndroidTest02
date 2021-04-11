package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.commons.lang3.StringUtils;

public class MainActivity extends AppCompatActivity {
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        text1.setText("ssssssssssssssssssssssss");
        text1.setOnClickListener(ClickAction.clickToastStr(this, "str"));
    }

    private void setViews() {
        text1 = findViewById(R.id.text1);
    }


}