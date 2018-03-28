package com.adolphor.uiwidgettest.layout.listView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.adolphor.uiwidgettest.BaseActivity;
import com.adolphor.uiwidgettest.R;

public class ListView01Activity extends BaseActivity {

    private String[] data = {"Apple", "Banana", "Orange", "WaterMelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
            "Apple", "Banana", "Orange", "WaterMelon",
            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"
    };

    public static void actionStart(Context context){
        Intent intent = new Intent(context, ListView01Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view01);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ListView01Activity.this,
                android.R.layout.simple_list_item_1, data);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }

}
