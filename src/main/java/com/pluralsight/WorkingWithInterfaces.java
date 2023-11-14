package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WorkingWithInterfaces {
    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<Person>();

        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        myFamily.sort(Comparator.naturalOrder());

        for (Person p : myFamily) {
            System.out.println(p.getFirstName() + " - " + p.getLastName() + " - " + p.getAge());
        }


    }



}
