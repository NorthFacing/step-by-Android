package com.haizhu.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);// ���ز����ļ���һ��Ҫ���أ����������ȡbutton��ʱ��ͻ��ָ���쳣
		button = (Button) this.findViewById(R.id.button);// ��ȡҳ��Ԫ��button
		button.setOnClickListener(new View.OnClickListener() {// ���Ӽ����¼�
			@Override
			public void onClick(View v) {// ����¼�
				Intent intent = new Intent(MainActivity.this, OtherActivity.class);// ʹ��intent��ֵ
				intent.putExtra("name", "����");
				intent.putExtra("age", 27);
				intent.putExtra("address", "��������");
				startActivity(intent);// ����Intent
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		System.out.println("onCreateOptionsMenu");
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
