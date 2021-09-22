package com.company;


/**
 * Created by Rollershop on 29.05.2016.
 */
public class Rollerskates {
    private String brand;
    private String model;
    private double size;
    private int diametrKoles;
    private int godVypuska;


    public Rollerskates(String brand, String model, double size, int diametrKoles, int godVypuska) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.diametrKoles = diametrKoles;
        this.godVypuska = godVypuska;

    }


    @Override
    public String toString() {
        return "Roliki " +
                " Производитель " + this.brand +
                ", модель " + this.model +
                ", размер " + this.size +
                ", диаметр колес " + this.diametrKoles +
                ", год выпуска " + this.godVypuska
                ;
    }
}
