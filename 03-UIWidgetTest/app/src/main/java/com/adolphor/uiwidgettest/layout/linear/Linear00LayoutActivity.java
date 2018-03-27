package com.adolphor.uiwidgettest.layout.linear;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

        View button01 = findViewById(R.id.button1);
        button01.setOnClickListener(this);

        View button02 = findViewById(R.id.button2);
        button02.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Linear01LayoutActivity.actionStart(this);
                break;
            case R.id.button2:
                Linear02LayoutActivity.actionStart(this);
                break;
            default:
                break;
        }
    }

}
