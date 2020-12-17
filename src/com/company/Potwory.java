package com.company;

public class Potwory {
    private String name;
    private String origin;
    private int numberHands;
    private int numberLegs;

    public Potwory(String name, String origin, int numberHands, int numberLegs) {
        this.name = name;
        this.origin = origin;
        this.numberHands = numberHands;
        this.numberLegs = numberLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getNumberHands() {
        return numberHands;
    }

    public void setNumberHands(int numberHands) {
        this.numberHands = numberHands;
    }

    public int getNumberLegs() {
        return numberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        this.numberLegs = numberLegs;
    }

    @Override
    public String toString() {
        return "Potwory{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", numberHands=" + numberHands +
                ", numberLegs=" + numberLegs +
                '}';
    }
}
