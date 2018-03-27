package com.adolphor.uiwidgettest.layout.relative;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Relative00LayoutActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Relative00LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative00_layout);

        View btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        View btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Relative01LayoutActivity.actionStart(this);
                break;
            case R.id.button2:
                Relative02LayoutActivity.actionStart(this);
                break;
            default:
                break;
        }
    }

}
