package com.example.inzxing;

import android.app.Application;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * Created by libo on 2018/2/11.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }

}
