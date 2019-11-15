package com.company;

public class SoftwareApp {

    private final String back;
    private final String backFr;
    private final String front;
    private final String frontFr;

    public SoftwareApp(String back, String front, String backFr, String frontFr) {
        this.back = back;
        this.front = front;
        this.backFr = backFr;
        this.frontFr = frontFr;
    }

    @Override
    public String toString() {
        return "La aplicación va a tener un backend realizado en el lenguaje " + back+ " usando el framework "+backFr +
                ", y el frontend va a ser escrito en el lenguaje "+ front + " con el framework " + frontFr;
    }
}
