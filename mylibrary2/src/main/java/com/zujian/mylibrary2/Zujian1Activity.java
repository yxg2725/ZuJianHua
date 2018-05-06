package com.zujian.mylibrary2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/zujian/zujian1")
public class Zujian1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(40);
        textView.setText("ZUJIAN1");
        setContentView(textView);
    }
}
