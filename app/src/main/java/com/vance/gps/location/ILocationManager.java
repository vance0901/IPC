package com.vance.gps.location;


import com.vance.ipc2.ServiceId;

@ServiceId("LocationManager")
public interface ILocationManager {

    Location getLocation();
}

