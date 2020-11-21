package com.company;

public class Eggs extends Protein{


     private String LoadPoint;
    private String sort;
    private double setSize;
    String className ="Eggs";

    public void Print() {

        System.out.println("Предложение яйца куриные :  размер упаковки:  "+ setSize+", " +
                "сорт: "+sort+",  пунт отпуска:  "+LoadPoint);
    }

    public String getLoadPoint() {
        return LoadPoint;
    }

    public String getSort() {
        return sort;
    }

    public double getSetSize() {
        return setSize;
    }
}
