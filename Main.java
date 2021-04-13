package com.company;

public class Main {

    public static void main(String[] args) {
        Camera.printStaticNumberOfGoods();
        Camera camera1 = new Camera();
        Camera camera2 = new Camera(720, 128, "Nikon", "RED");
        Camera camera3 = new Camera(13, 64, "Plastic", "White",  300, "Germany",  "350", 5);
        System.out.println(camera1);
        System.out.println(camera2);
        System.out.println(camera3);
        Camera.printStaticNumberOfGoods();
        camera1.resetValues(1080, 16, "Sony", "Silver", 450, "USA", "500", 125);
        System.out.println(camera1);
    }
}