package com.company;

public class Camera {
    private double photo_quality = 480;
    private double memory = 1;
    private String name = "Canon";
    private String color = "White";
    private double price = 1;
    private String originCountry = "Ukraine";
    private static int numberGoods = 0;
    protected String weight = "200";
    protected double zoom = 15;

    public Camera() {
        numberGoods += 1;
    }

    public Camera(double photo_quality, double memory, String name, String color) {
        this.photo_quality = photo_quality;
        this.memory = memory;
        this.name = name;
        this.color = color;
        numberGoods += 1;
    }

    public Camera(double photo_quality, double memory, String material, String color,
                double price, String originCountry, String weight, double zoom) {
        this(photo_quality, memory, material, color);
        this.price = price;
        this.originCountry = originCountry;
        this.weight = weight;
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Camera{"
                + "Photo quality:" + photo_quality
                + ", Memory:" + memory
                + ", Name:" + name
                + ", Color:" + color
                + ", Price:" + price
                + ", Origin Country:" + originCountry
                + ", Weight:" + weight
                + ", Zoom:" + zoom
                + "}";
    }

    public static void printStaticNumberOfGoods() {
        System.out.println(numberGoods);
    }

    public void printNumberOfObj() {
        System.out.println(numberGoods);
    }

    public void resetValues(double photo_quality, double memory, String name, String color,
                            double price, String originCountry, String weight, double zoom) {
        this.photo_quality = photo_quality;
        this.memory = memory;
        this.name = name;
        this.color = color;
        this.price = price;
        this.originCountry = originCountry;
        this.weight = weight;
        this.zoom = zoom;
    }

    public double getPhoto_quality() {
        return this.photo_quality;
    }

    public double getMemory() {
        return this.memory;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }


    public double getPrice() {
        return this.price;
    }

    public String getOriginCountry() {
        return this.originCountry;
    }


    public void setPhoto_quality(double photo_quality) {
        this.photo_quality = photo_quality;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

}