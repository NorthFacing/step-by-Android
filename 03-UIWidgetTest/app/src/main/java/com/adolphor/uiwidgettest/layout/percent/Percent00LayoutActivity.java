package com.adolphor.uiwidgettest.layout.percent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Percent00LayoutActivity extends BaseActivity {

    private static final String TAG = "Percent00LayoutActivity";

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Percent00LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent00_layout);

        View frameBtn = findViewById(R.id.frameBtn);
        frameBtn.setOnClickListener(this);

        View relativeBtn = findViewById(R.id.relativeBtn);
        relativeBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frameBtn:
                PercentFrameLayoutActivity.actionStart(this);
                break;
            case R.id.relativeBtn:
                PercentRelativeLayoutActivity.actionStart(this);
                break;
            default:
                Log.e(TAG, "onClick: 找不到对应触发事件", new NullPointerException("onClick: 找不到对应触发事件"));
                break;
        }
    }

}
