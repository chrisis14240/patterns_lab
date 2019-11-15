package com.company;

public class SoftwareAppBuilder {

    private String back;
    private String front;
    private String backFr;
    private String frontFr;

    public SoftwareAppBuilder setBack(String back) {
        this.back = back;
        return this;
    }

    public SoftwareAppBuilder setBackFr(String backFr) {
        this.backFr = backFr;
        return this;
    }
    public SoftwareAppBuilder setFront(String front) {
        this.front = front;
        return this;
    }

    public SoftwareAppBuilder setFrontFr(String frontFr) {
        this.frontFr = frontFr;
        return this;
    }

    public SoftwareApp build() {
        return new SoftwareApp(back, front, backFr, frontFr);
    }
}


