package com.company;

public class Milk extends Protein {


    private String producer;
    private double MilkFat;
    private int pacageSize;

    public Milk(String className,String producer, double MilkFat, int pacageSize) {
        super(className);
        this.producer =producer;
        this.MilkFat= MilkFat;
        this.pacageSize= pacageSize;
    }


    @Override
    public void print() {
        System.out.println("Предложение:  " +super.getClassName()+"  размер упаковки(л):  " + pacageSize + ", " +
                "жирность: " + MilkFat + ",  производитель:  " + producer);
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
