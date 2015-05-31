package com.haizhu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class OtherActivity extends Activity {

	private TextView textView;

	@Override
	protected void onStart() {
		super.onStart();
		setContentView(R.layout.activity_other);// 加载布局文件
		textView = (TextView) this.findViewById(R.id.msg);// 获取文本元素

		Intent intent = getIntent();// 获取用来传值的Intent
		String name = intent.getStringExtra("name");// 取值
		int age = intent.getIntExtra("age", 0);
		String address = intent.getStringExtra("address");

		textView.setText("name -> " + name + "\nage -> " + age + "\naddress -> " + address);// 将值赋予textView元素
	}
}
