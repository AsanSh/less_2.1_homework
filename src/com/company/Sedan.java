package com.company;

import java.util.PrimitiveIterator;

public class Sedan extends Car{

    private int prodYear;
    private int volume;
    private Condition condition;
    private Color color;


//1
    public Sedan(String transmissionType) {
        super(transmissionType);
    }

//2
    public Sedan(String transmissionType, int prodYear, Condition condition) {
        super(transmissionType);
        this.prodYear = prodYear;
        this.condition = condition;
    }

//3
    public Sedan(String transmissionType, int volume, Color color, int prodYear) {
        super(transmissionType);
        this.prodYear = prodYear;
        this.volume = volume;
        this.color = color;
    }


    public int getProdYear() {
        return prodYear;
    }

    public int getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }
}


