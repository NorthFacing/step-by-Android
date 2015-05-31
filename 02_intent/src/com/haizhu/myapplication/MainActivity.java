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
		setContentView(R.layout.activity_main);// 加载布局文件，一定要加载，否则下面获取button的时候就会空指针异常
		button = (Button) this.findViewById(R.id.button);// 获取页面元素button
		button.setOnClickListener(new View.OnClickListener() {// 增加监听事件
			@Override
			public void onClick(View v) {// 点击事件
				Intent intent = new Intent(MainActivity.this, OtherActivity.class);// 使用intent传值
				intent.putExtra("name", "张三");
				intent.putExtra("age", 27);
				intent.putExtra("address", "杭州西湖");
				startActivity(intent);// 启动Intent
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
