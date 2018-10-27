package com.company;

import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args){

        String [] tablica = {"Monika", "Ola", "Ala"};
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){

            System.out.println("Imię: " + tablica[i].toLowerCase());
            System.out.println("Liczba liter: " + tablica[i].length());
            suma += tablica[i].length();
        }
        System.out.println("Suma liter: " + suma);

    }

}

//--------------------------------
//        switch (a){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//
//            default:
//                System.out.println("9");
//        }

//        -----------------------------------------
//        if(a > 0 && a< 5){
//            System.out.println("hura!");}
//
//        else if (a > 5 && a < 10){
//            System.out.println("nope!");}
//
//        else {
//            System.out.println("o nie nie!");}

//----------------------------------
//        do {
//            System.out.println(a); a++;
//        } while (a < 10);
//
// do while liczy przynajmniej jeden raz
//        while (a < 10){
//            System.out.println(a);
//            a++;
//        }

//-------------------------
//        System.out.println("Podaj pierwszą liczbę:");
//        Scanner scanner = new Scanner(System.in); //typ zmiennej
//        int liczba1 = scanner.nextInt();
//
//        System.out.println("Podaj drugą liczbę:");
//        int liczba2 = scanner.nextInt();
//
//        if (liczba2 == 0){
//        System.out.println("Wybrałeś złą liczbę:");
//        }
//
//        double wynik = liczba1/ (double)liczba2;
//        System.out.println("Wynik:" + wynik);
//        System.out.println("Wybrałeś " + liczba + '!');