
package com.adolphor.uiwidgettest.layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;
import com.adolphor.uiwidgettest.layout.linear.Linear00LayoutActivity;
import com.adolphor.uiwidgettest.layout.relative.Relative00LayoutActivity;

public class LayoutActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, LayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        View buttonLinear = findViewById(R.id.btn_layout_linear);
        buttonLinear.setOnClickListener(this);

        View buttonRelative = findViewById(R.id.btn_layout_relative);
        buttonRelative.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_layout_linear:
                Linear00LayoutActivity.actionStart(this);
                break;
            case R.id.btn_layout_relative:
                Relative00LayoutActivity.actionStart(this);
                break;
            default:
                break;
        }
    }
}
