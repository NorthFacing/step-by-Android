package com.adolphor.uiwidgettest.layout.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.adolphor.uiwidgettest.R;

/**
 * Created by adolphor on 2018/3/28.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context) {
        super(context);
    }

    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_custom01_include, this);
    }

}
