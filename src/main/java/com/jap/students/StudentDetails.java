package com.jap.students;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class StudentDetails {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(110,"Malcolm","King","23, Alder main"),
                new Student(102,"Gary","Aldrin","123, Marble main"),
                new Student(114,"Yani","Tress","45, Francis Street"),
                new Student(111,"Sharon","Stone","12, Martha street"),
                new Student(108,"Jane","Jacob","10, Marble drive"));
        System.out.println("The Student List Before Sorting");
        for(Student s : studentList){
            System.out.println(s);
        }
        Collections.sort(studentList);
        System.out.println("The Student List After Sorting");
        for(Student s : studentList){
            System.out.println(s);
        }


    }


}
