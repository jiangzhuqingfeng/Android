package com.jiangfeng.task;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocationService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
