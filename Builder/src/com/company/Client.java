package com.company;

public class Client {

    public static void main(String[] args) {

        SoftwareApp app = new SoftwareAppBuilder()
                .setBack("Python")
                .setBackFr("Django")
                .setFront("JavaScript")
                .setFrontFr("React").build();

        System.out.print(app);
    }

}
