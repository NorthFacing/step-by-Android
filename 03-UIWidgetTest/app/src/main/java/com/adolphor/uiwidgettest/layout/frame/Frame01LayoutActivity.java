package com.adolphor.uiwidgettest.layout.frame;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Frame01LayoutActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Frame01LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame01_layout);
    }

    @Override
    public void onClick(View v) {

    }

}
