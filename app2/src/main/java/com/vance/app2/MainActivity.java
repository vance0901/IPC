package com.vance.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.vance.ipc2.IPC2;
import com.vance.ipc2.IPCService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //IPC2位IPC的改进版
        IPC2.connect(this,"com.vance.gps", IPCService.IPCService0.class);
    }


    public void test(View view) {
        //代理对象
        ILocationManager location = null;
        try {
            location = IPC2.getInstanceWithName(IPCService.IPCService0.class,
                    ILocationManager.class,"getDefault");
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "请先运行app项目,并保持后台运行,别杀掉进程", Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "当前位置:" + location.getLocation(), Toast.LENGTH_LONG).show();
    }
}
