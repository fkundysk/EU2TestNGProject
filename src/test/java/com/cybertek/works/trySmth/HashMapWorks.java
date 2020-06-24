package com.cybertek.works.trySmth;
import  java.util.HashMap ;

public class HashMapWorks<number> {

    // attributes name and first name of a student
    String name, first_name;
    // attribute_number student number (unique number )
    int matriculation_number;

    // constructor for a student
    public HashMapWorks(String name, String first_name, int matriculation_number) {
        this.name = name;
        this.first_name = first_name;
        this.matriculation_number = matriculation_number;
    }

    // getter method for the student number
    public int getMatriculation_number() {
        return this.matriculation_number;
    }
    public String getName() {
        return (this.name + " " + this.first_name);
    }

}
