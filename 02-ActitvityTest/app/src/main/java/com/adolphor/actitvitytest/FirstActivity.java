package com.adolphor.actitvitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: button 1");
            }
        });

        // Toast事件
        Button button_pop = (Button) findViewById(R.id.button_pop);
        button_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
            }
        });

        // 显式Intent
        Button button_explicit_intent = (Button) findViewById(R.id.button_explicit_intent);
        button_explicit_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        // 隐式Intent
        Button button_implicit_intent = (Button) findViewById(R.id.button_implicit_intent);
        button_implicit_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.adolphor.activitytest.ACTION_START");
                intent.addCategory("com.adolphor.activitytest.MY_CATEGORY");
                startActivity(intent);
            }
        });

        // 隐式Intent：调用系统组件
        Button button_web_view = (Button) findViewById(R.id.button_intent_web_view);
        button_web_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        // 隐式Intent：拨打电话
        Button button_tel = (Button) findViewById(R.id.button_tel);
        button_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

        // 结束活动
        Button button_finish = (Button) findViewById(R.id.button_finish);
        button_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    // 复写菜单：return true显示，false 不显示
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // 复写菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(FirstActivity.this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(FirstActivity.this, "Yout clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default: // 可以省略！
        }
        return true;
    }
}
