package com.company;

import com.sun.tools.javah.Gen;

public class Main {

    public static void main(String[] args) {

        osoba monia = new osoba("Monika", "Anger", Gender.FEMALE);
        osoba monia1 = new osoba("Monika", "Anger", Gender.FEMALE);

        System.out.println(monia.equals(monia1));

//        String a = new String("Java");
//        String b = new String("Java");
//        String c = "Java";
//        String d = "Java";
//
//        System.out.println(a==b);
//        System.out.println(c==d);



//    kostka kostka = new kostka (3);
//
//            for(int i = 0; i < kostka.getliczba(); i++ ){
//                System.out.println(kostka.rzut());
//            }

//        dog reksio = new dog("Reksio");
////        reksio.name = "Reksio"; to mozemy juz wyrzucić
//        System.out.println(reksio.getNumberOfLegs());
//
//        reksio.setNumberOfLegs(3);
//
//        System.out.println(reksio.getNumberOfLegs());
//        reksio.bark();  //wywyołujemy szczekanie //musze miec obiekt
//        dog.sayHau(); //wrzucamy klase //nie potrzebuje obiektu, klasa jest statyczna, wiec dla kazdego dziala

    }
}
