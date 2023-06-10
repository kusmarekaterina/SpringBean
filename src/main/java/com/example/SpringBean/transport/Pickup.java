package com.example.SpringBean.transport;

public class Pickup extends Transport {

    public Pickup(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Пикап готов к работе");
    }


}
