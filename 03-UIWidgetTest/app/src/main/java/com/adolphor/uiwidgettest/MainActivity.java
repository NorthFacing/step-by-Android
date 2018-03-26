package com.adolphor.uiwidgettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buttonWidget = findViewById(R.id.button_widget);
        buttonWidget.setOnClickListener(this);

    }

    // 设置监听的时候不使用你匿名实现类，而使用另外一种方式
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_widget:
                WidgetActivity.actionStart(MainActivity.this);
                Log.d(TAG, "onClick: button_widget");
                break;
            default:
                break;
        }
    }
}
