package com.letthingsspeak.shubham.letthingsspeak.device;

public class DeviceDetails {

    public DeviceDetails(String roomType, String status) {
        this.roomType = roomType;
        this.status = status;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String roomType;
    private String status;
}
