package com.company;

public class Toyota extends Sedan {

    private Condition condition;
    private int volume;
    private Color color;


    public Toyota(String transmissionType, Condition condition, int volume) {
        super(transmissionType);
        this.condition = condition;
        this.volume = volume;
    }


    public Toyota(String transmissionType, int volume, Condition condition, Color color) {
        super(transmissionType);
        this.volume = volume;
        this.condition = condition;
        this.color = color;
    }


    public Condition getCondition() { return condition; }
    public int getVolume() { return volume; }
    public Color getColor() { return color; }

    private String defineCondition(int prodYear, Condition condition, Color color) {
        return prodYear + " " + condition + " "+ color;
    }

}
