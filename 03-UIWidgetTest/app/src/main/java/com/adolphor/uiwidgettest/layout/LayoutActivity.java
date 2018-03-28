
package com.adolphor.uiwidgettest.layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;
import com.adolphor.uiwidgettest.layout.constraint.Constraint00LayoutActivity;
import com.adolphor.uiwidgettest.layout.custom.Custom01IncludeActivity;
import com.adolphor.uiwidgettest.layout.custom.Custom02TitleLayoutActivity;
import com.adolphor.uiwidgettest.layout.frame.Frame00LayoutActivity;
import com.adolphor.uiwidgettest.layout.linear.Linear00LayoutActivity;
import com.adolphor.uiwidgettest.layout.listView.ListView00Activity;
import com.adolphor.uiwidgettest.layout.percent.Percent00LayoutActivity;
import com.adolphor.uiwidgettest.layout.relative.Relative00LayoutActivity;

public class LayoutActivity extends BaseActivity {

    private static final String TAG = "LayoutActivity";

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

        View buttonFrame = findViewById(R.id.btn_layout_frame);
        buttonFrame.setOnClickListener(this);

        View buttonPercent = findViewById(R.id.btn_layout_percent);
        buttonPercent.setOnClickListener(this);

        View buttonConstraint = findViewById(R.id.btn_layout_constraint);
        buttonConstraint.setOnClickListener(this);

        View buttonInclude = findViewById(R.id.btn_layout_include);
        buttonInclude.setOnClickListener(this);

        View buttonCustom = findViewById(R.id.btn_layout_custom);
        buttonCustom.setOnClickListener(this);

        View listView = findViewById(R.id.btn_layout_listView);
        listView.setOnClickListener(this);

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
            case R.id.btn_layout_frame:
                Frame00LayoutActivity.actionStart(this);
                break;
            case R.id.btn_layout_percent:
                Percent00LayoutActivity.actionStart(this);
                break;
            case R.id.btn_layout_constraint:
                Constraint00LayoutActivity.actionStart(this);
                break;
            case R.id.btn_layout_include:
                Custom01IncludeActivity.actionStart(this);
                break;
            case R.id.btn_layout_custom:
                Custom02TitleLayoutActivity.actionStart(this);
                break;
            case R.id.btn_layout_listView:
                ListView00Activity.actionStart(this);
                break;
            default:
                Log.e(TAG, "onClick: 找不到对应触发事件", new NullPointerException("onClick: 找不到对应触发事件"));
                break;
        }
    }
}
