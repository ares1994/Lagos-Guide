package com.example.android.lagosguide;

public class Data {
    private String name;
    private String address;
    private static int NO_IMAGE_RECEIVED = -1;
    private int imageResourceId = NO_IMAGE_RECEIVED;

    Data(String name, String address, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.imageResourceId = imageResourceId;

    }

    Data(String name, String address) {
        this.name = name;
        this.address = address;

    }


    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    int getImageResourceId() {
        return imageResourceId;
    }

    boolean hasImage() {

        return imageResourceId != NO_IMAGE_RECEIVED;

    }
}
