package com.company;

public class Milk extends Protein {

   ;
    private String producer;
    private double MilkFat;
    private int pacageSize;
    String className ="Milk";
    public void Print() {

        System.out.println("Предложение Молоко:  размер упаковки:  "+pacageSize+", " +
                "жирность: "+MilkFat+",  производитель:  "+producer);
    }
    public String getProducer() {
        return producer;
    }
    public double getMilkFat() {
        return MilkFat;
    }

    public int getPacageSize() {
        return pacageSize;
    }


}
