package com.ajmayen.di_ioc.model;

public class Computer {

    private String brand;
    private String model;
    private int ram;
    private int ssd;


    public Computer() {
    }

    public Computer(String brand, String model, int ram, int ssd) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }
}
