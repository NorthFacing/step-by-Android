package com.adolphor.uiwidgettest;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class WidgetActivity extends BaseActivity {

    private static final String TAG = "WidgetActivity";

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    public static void actionStart(Context context){
        Intent intent = new Intent(context, WidgetActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        editText = findViewById(R.id.edit_text);
        Button buttonToast = findViewById(R.id.button_toast);
        buttonToast.setOnClickListener(this);

        imageView = findViewById(R.id.image_view);
        Button buttonImage = findViewById(R.id.button_image);
        buttonImage.setOnClickListener(this);

        progressBar = findViewById(R.id.progress_bar);
        Button buttonProgress = findViewById(R.id.button_progress);
        buttonProgress.setOnClickListener(this);

        Button buttonAlertDialog = findViewById(R.id.button_alert_dialog);
        buttonAlertDialog.setOnClickListener(this);

        Button buttonProgressDialog = findViewById(R.id.button_progress_dialog);
        buttonProgressDialog.setOnClickListener(this);

    }

    // 设置监听的时候不使用你匿名实现类，而使用另外一种方式
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_toast:
                Log.i(TAG, "onClick button_toast");
                String inputStr = editText.getText().toString();
                Toast.makeText(WidgetActivity.this, inputStr, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_image:
                Log.i(TAG, "onClick button_image ");
                imageView.setImageResource(R.drawable.img02);
                break;
            case R.id.button_progress:
                Log.i(TAG, "onClick button_progress");
                // 显示和隐藏
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
                // 进度条变化
                int progress = progressBar.getProgress();
                if (progress < 100) {
                    progressBar.setProgress(progress + 30);
                } else {
                    progressBar.setProgress(0);
                }
                break;
            case R.id.button_alert_dialog:
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(WidgetActivity.this);
                alertDialog.setTitle("This is dialog");
                alertDialog.setMessage("Something important");
                alertDialog.setCancelable(false); // 不能通过back键取消掉
                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i(TAG, "onClick button_dialog: OK");
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i(TAG, "onClick button_dialog: Cancel");
                    }
                });
                alertDialog.show();
                break;
            case R.id.button_progress_dialog:
                ProgressDialog progressDialog = new ProgressDialog(WidgetActivity.this);
                progressDialog.setTitle("This is progress dialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                // progressDialog.dismiss(); // 加载完毕之后可以使用此方法关闭dialog
                break;
            default:
                break;
        }
    }

}
