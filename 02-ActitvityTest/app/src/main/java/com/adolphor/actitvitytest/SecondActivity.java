package com.adolphor.actitvitytest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // button_request_data 对应代码，当通过点击 button_requst_data 按钮来到此页面，下面的值就不为空
        final Intent reqIntent = getIntent();
        String extraData = reqIntent.getStringExtra("extra_data");
        Log.d(TAG, "onCreate: " + extraData);

        // 点击 button_2 & button_response_data 对应代码
        Button button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responseOprt();
            }
        });

    }

    // 覆写此方法，这样当点击返回按钮的时候也能够传递数据给上一层activity
    @Override
    public void onBackPressed() {
        responseOprt();
    }

    private void responseOprt() {
        Intent respIntent = new Intent();
        respIntent.putExtra("return_data", "Hello FirstActivity");
        setResult(RESULT_OK, respIntent);
        finish();
    }

    // 最佳实践：参数传递，button_params 对应方法
    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }
}
