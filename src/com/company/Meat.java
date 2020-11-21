package com.company;

public class Meat extends Protein {


    private String ownerName;
    private String kindOfAnimal;
    private double meatFat;


    public Meat(String className, String ownerName, String kindOfAnimal, double meatFat) {
        super(className);
        this.ownerName = ownerName;
        this.kindOfAnimal = kindOfAnimal;
        this.meatFat = meatFat;
    }

    @Override
    public void print() {
        System.out.println("Предложение : " +super.getClassName()+ " вид:  " + kindOfAnimal +
                ",  жирность: " + meatFat + ", владелец: " + ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public double getMeatFat() {
        return meatFat;
    }
}
