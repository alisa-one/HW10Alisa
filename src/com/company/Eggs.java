package com.company;

public class Eggs extends Protein {


    private String loadPoint;
    private String sort;
    private int setSize;


    public Eggs(String className, String loadPoint, String sort, int setSize) {
        super(className);
        this.loadPoint = loadPoint;
        this.sort = sort;
        this.setSize = setSize;
    }

    @Override
    public void print() {
        System.out.println("Предложение:  "+super.getClassName()+ "  размер упаковки:  " + setSize + ", " +
                "сорт: " + sort + ",  пунт отпуска:  " + loadPoint);
    }

    public String getLoadPoint() {
        return loadPoint;
    }

    public String getSort() {
        return sort;
    }

    public double getSetSize() {
        return setSize;
    }
}
