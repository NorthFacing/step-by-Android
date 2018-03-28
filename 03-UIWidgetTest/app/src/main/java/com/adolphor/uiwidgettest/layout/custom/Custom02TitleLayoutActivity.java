package com.adolphor.uiwidgettest.layout.custom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class Custom02TitleLayoutActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Custom02TitleLayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom02_title_layout);

        View titleBack = findViewById(R.id.title_back);
        titleBack.setOnClickListener(this);

        View titleEdit = findViewById(R.id.title_edit);
        titleEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_back:
                Custom02TitleLayoutActivity.this.finish();
                break;
            case R.id.title_edit:
                Toast.makeText(Custom02TitleLayoutActivity.this, "You clicked Edit button",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}
