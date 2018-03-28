package com.adolphor.uiwidgettest.layout.listView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class ListView00Activity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, ListView00Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view00);

        View button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        View button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                ListView01Activity.actionStart(this);
                break;
            case R.id.button2:
                ListView02Activity.actionStart(this);
                break;
            default:
                break;
        }
    }

}
