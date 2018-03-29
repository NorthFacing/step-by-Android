package com.adolphor.uiwidgettest.layout.recyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class RecyclerView00Activity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, RecyclerView00Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view00);

        View button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                RecyclerView01Activity.actionStart(this);
                break;
            default:
                break;
        }

    }

}
