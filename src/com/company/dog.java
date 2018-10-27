package com.company;

public class dog {
    //def. cechy, które nazywamy polami
    // metoda = funkcja; fragment kodu, który możemy uzywać wielokrotnie
    // najpierw new, a pozniej konstruktor. wrzuca tylko wartosci

    String name;
    private int numberOfLegs;

    //jak narzucasz liczbę, to nie trzeba w nawiasach wpisywać zmiennej. w name dawaliśmy do wyboru imię
    public dog() {this.numberOfLegs = 4; }

    public dog(String name) {
        this(); //musi byc 1. linijka kodu. oznscza wez mi wywołaj 12
        this.name = name; }



    public void bark(){
        System.out.println("Hua Hua!");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
// dlaczego get i set? robiac funkcje do ktorej i tak jest dostęp umożliwia kontrolowanie uzytkownika, narzucanie ogarniczen itp
    public void  setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }
 public static void sayHau(){
        System.out.println("hau");
 }

}
