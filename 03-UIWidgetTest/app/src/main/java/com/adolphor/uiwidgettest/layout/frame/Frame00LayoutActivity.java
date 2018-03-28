package com.adolphor.uiwidgettest.layout.frame;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Frame00LayoutActivity extends BaseActivity {

    private static final String TAG = "Frame00LayoutActivity";

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Frame00LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame00_layout);

        View button1 = findViewById(R.id.frameBtn);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frameBtn:
                Frame01LayoutActivity.actionStart(this);
                break;
            default:
                Log.e(TAG, "onClick: 找不到对应触发事件", new NullPointerException("onClick: 找不到对应触发事件"));
                break;
        }

    }

}
