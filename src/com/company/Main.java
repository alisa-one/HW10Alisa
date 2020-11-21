package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Milk").print();
        createObject("Meat").print();
        createObject("Eggs").print();

    }

    public static Printable createObject(String className) {
        Printable clas = null;

        switch (className) {
            case "Milk":
                clas = new Milk("молоко", "БишкекСут", 2.5, 1);
                break;
            case "Meat":
                clas = new Meat("мясо", "Janybek", "говядина", 15.7);
                break;
            case "Eggs":
                clas = new Eggs("яйца куриные", "ТокмокБаза", "высший", 30);
                break;
        }

        return clas;


    }
}
