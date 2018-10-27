package com.company;

public class kostka {

    int liczba;

    public kostka(int liczba) { this.liczba = liczba; }

    //metoda
    public int rzut(){

        int number = (int) (Math.random() * 6 +1);
        return number;
    }

    public int getliczba(){
        return liczba;
    }

}
