package com.vance.gps;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.vance.gps.location.Location;
import com.vance.gps.location.LocationManager;
import com.vance.ipc2.IPC2;


public class GpsService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        //定位
        LocationManager.getDefault().setLocation(new Location("广东省深圳市", 111.11d, 22.22d));
        /**
         * 1、在数据/服务提供方进行服务注册
         */
        IPC2.register(LocationManager.class);
    }
}
