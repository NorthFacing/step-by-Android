package com.adolphor.uiwidgettest.layout.relative;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Relative00LayoutActivity extends BaseActivity {

    private static final String TAG = "Relative00LayoutActivit";

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Relative00LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative00_layout);

        View btn1 = findViewById(R.id.frameBtn);
        btn1.setOnClickListener(this);

        View btn2 = findViewById(R.id.relativeBtn);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frameBtn:
                Relative01LayoutActivity.actionStart(this);
                break;
            case R.id.relativeBtn:
                Relative02LayoutActivity.actionStart(this);
                break;
            default:
                Log.e(TAG, "onClick: 找不到对应触发事件", new NullPointerException("onClick: 找不到对应触发事件"));
                break;
        }
    }

}
