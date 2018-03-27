package com.adolphor.uiwidgettest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.adolphor.uiwidgettest.layout.LayoutActivity;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buttonWidget = findViewById(R.id.btn_widget);
        buttonWidget.setOnClickListener(this);

        View buttonLayout = findViewById(R.id.btn_layout);
        buttonLayout.setOnClickListener(this);

    }

    // 设置监听的时候不使用你匿名实现类，而使用另外一种方式
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_widget:
                WidgetActivity.actionStart(MainActivity.this);
                Log.d(TAG, "onClick: button_widget");
                break;
            case R.id.btn_layout:
                LayoutActivity.actionStart(MainActivity.this);
                Log.d(TAG, "onClick: button_layout");
                break;
            default:
                break;
        }
    }

}
