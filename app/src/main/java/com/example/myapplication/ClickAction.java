package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickAction {

    public static View.OnClickListener clickToastStr(Context context, String str) {
        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
            }
        };
        return OnClickListener;
    }
}
