package com.company;

public class Main {

    private static Printable Meat;
    private static Printable Milk;
    private static Printable Eggs;

    public static void main(String[] args) {
        // write your code here
        String className = null;
        Printable[] Objects = new Printable[]{Milk, Meat, Eggs};

        public String CreateObject (String className){

            switch (className) {
                if (className == "Milk") {
                    return Milk.Print();
                }
                if (className == "Meat") {
                    return Meat.Print();
                }
                if (className=="Eggs"){
                    return Eggs.Print();
                }
                default -> System.out.println("No data");
            }
        }

    }
}
