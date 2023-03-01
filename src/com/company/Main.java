package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student=new Student("Adelka","Muktarbekova","win1-21", 5);
        Aspirant aspirant=new Aspirant("Bermet", "Kartanbaeva", "ain2-21",4,"work");
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student);
        arrayList.add(aspirant);
        System.out.println(arrayList.get(0).getScholarship());
        System.out.println(arrayList.get(1).getScholarship());

    }
}
