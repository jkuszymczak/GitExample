package com.company;

public class Hello_World {

    public static void main(String[] args){
        //komentowanie
        int i = 19;
        int k = 15;
        long ageOfUniverse = 196463782726626L;
        float a = 19.15f;
        double b = 19.15;
        char c = 'c';  //Tylko dla poj. liter
        boolean isJavaFun = true; //Przyjmuje tylko 2 wartosci; T/F
        double wynik = i / (double)k;  //jedna z liczb musi byc double; zmieniamy jednego int'a na liczbę zmiennoprzecinkową i juz, powinno dobrze dzielić
       // System.out.println(wynik);

        String name = "Julia";  //zbiór liter

        int[] tablica = {1, 2, 3}; //tablica=nawiasy
        double[] tablica1 = new double[10];
        tablica1[0] = 0.19;

        int [][] f = new int [3][];
        f[0] = new int [5];
        f[1] = new int[3];
        f[2] = new int[2];

        f[1][0] = 5;

        //System.out.println(!(i > k || false)); //&& - and; || - lub
        System.out.println(wynik);
    }



}
