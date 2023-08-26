package com.vance.gps.location;


import com.vance.ipc2.ServiceId;

@ServiceId("LocationManager")
public class LocationManager {

    private static final LocationManager ourInstance = new LocationManager();

    public static LocationManager getDefault() {
        return ourInstance;
    }

    private LocationManager() {
    }

    private Location location;

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

}

