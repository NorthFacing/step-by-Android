package com.adolphor.uiwidgettest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by adolphor on 2018/3/27.
 */
public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "BaseActivity";

    public static void actionStart(Context context, Object... args) {
        Intent intent = new Intent(context, BaseActivity.class);
        context.startActivity(intent);
    }

    @Override
    public abstract void onClick(View v);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate: " + getClass().getSimpleName());
    }

}
