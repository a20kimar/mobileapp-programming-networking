package com.example.networking;

public class Mountain {

    private String name;
    private String location;
    private int height;

    @Override
    public String toString() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public int getHeight() {
        return height;
    }
    public Mountain(String n, String l, int h) {
        name = n;
        location = l;
        height = h;
    }
}
