package com.haizhu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class OtherActivity extends Activity {

	private TextView textView;

	@Override
	protected void onStart() {
		super.onStart();
		setContentView(R.layout.activity_other);// ���ز����ļ�
		textView = (TextView) this.findViewById(R.id.msg);// ��ȡ�ı�Ԫ��

		Intent intent = getIntent();// ��ȡ������ֵ��Intent
		String name = intent.getStringExtra("name");// ȡֵ
		int age = intent.getIntExtra("age", 0);
		String address = intent.getStringExtra("address");

		textView.setText("name -> " + name + "\nage -> " + age + "\naddress -> " + address);// ��ֵ����textViewԪ��
	}
}
