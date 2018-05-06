package com.zujian.commonlib;

import android.content.Context;
import android.widget.Toast;

public class Utils {

    private static Toast mToast;

    public static void toast(Context context, String msg){
        if (mToast == null) {
            mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }
}
