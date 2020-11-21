package com.company;

public class Protein implements Printable{


    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Protein(String className) {
        this.className = className;
    }

    @Override
    public void print() {

    }
}
