package com.company;

public class Main {

    public static void main(String[] args) {
        Camera.printStaticNumberOfGoods();
        Camera camera1 = new Camera();
        Camera camera2 = new Camera(720, 5, "Nikon", "Blue");
        Camera camera3 = new Camera(13, 17, "Glue", "Yellow",  300, "Germany",  "20%", 20);
        System.out.println(camera1);
        System.out.println(camera2);
        System.out.println(camera3);
        Camera.printStaticNumberOfGoods();
        camera1.resetValues(1080, 15, "Sony", "Green", 450, "Poland", "30%", 25);
        System.out.println(camera1);
    }
}