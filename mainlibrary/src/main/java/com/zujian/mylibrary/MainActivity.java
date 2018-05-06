package com.zujian.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zujian.commonlib.Utils;
import com.zujian.mylibrary.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.toast(this,"Main_module");

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build("/zujian/zujian1").navigation();
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build("/zujian2/zujian2").navigation();
            }
        });
    }
}
