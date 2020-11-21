package com.company;

public class Meat extends Protein {


    private String ownerName;
    private String KindOfAnimal;
    private double MeatFat;
    String className ="Meat";
    public void Print() {

        System.out.println("Предложение :   Мясо, вид:  " + KindOfAnimal +
                ",  жирность: " + MeatFat + ", владелец: " + ownerName);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getKindOfAnimal() {
        return KindOfAnimal;
    }

    public double getMeatFat() {
        return MeatFat;
    }
}
