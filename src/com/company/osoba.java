package com.company;

public class osoba {

    private String name;
    private String surname;

    private Gender gender;



    public osoba(String name, String surname, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.gender = gender;}

        public String getName() {return name;}
        public void setName(String name) { this.name = name;}

        public String getsurname() {return surname;}
        public void setsurame(String surname) { this.surname = surname;}


    @Override //
    public String toString() {
        return "osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override //adnotacje dla kompilatora
    public boolean equals(Object other) {
        osoba otherPerson = (osoba) other;
        return this.name.equals(otherPerson.name) &&
                this.surname.equals(otherPerson.surname) &&
                this.gender == otherPerson.gender;
    }
}
