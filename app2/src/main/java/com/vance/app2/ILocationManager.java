package com.vance.app2;


import com.vance.gps.location.Location;
import com.vance.ipc2.ServiceId;


@ServiceId("LocationManager")
public interface ILocationManager {

    Location getLocation();
}

