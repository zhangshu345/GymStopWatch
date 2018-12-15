package com.mmrx.gymstopwatch;

import android.app.Application;

import com.mmrx.gymstopwatch.data.DataModel;

public class StopWatchApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataModel.getDataModel().setContext(getApplicationContext());
    }
}
