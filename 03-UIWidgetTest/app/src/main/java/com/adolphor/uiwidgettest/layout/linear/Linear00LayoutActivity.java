package com.adolphor.uiwidgettest.layout.linear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Linear00LayoutActivity extends BaseActivity {

    private static final String TAG = "Linear00LayoutActivity";

    public static void actionStart(Context context){
        Intent intent = new Intent(context,Linear00LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear00_layout);

        View button01 = findViewById(R.id.frameBtn);
        button01.setOnClickListener(this);

        View button02 = findViewById(R.id.relativeBtn);
        button02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.frameBtn:
                Linear01LayoutActivity.actionStart(this);
                break;
            case R.id.relativeBtn:
                Linear02LayoutActivity.actionStart(this);
                break;
            default:
                Log.e(TAG, "onClick: 找不到对应触发事件", new NullPointerException("onClick: 找不到对应触发事件"));
                break;
        }
    }

}
