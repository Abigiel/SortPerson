package com.pluralsight;

public class Person implements Comparable{
    private String firstName;

    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 //   @Override
//    public int compareTo(Person p) {
//        int compare = a.compareTo(b);
//
//        if (compare < 0) {
//            //a is smaller
//        }
//        else if (compare > 0) {
//            //a is larger
//        }
//        else {
//            //a is equal to b
//        }
//    }
//}
