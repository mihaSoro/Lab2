package com.example.lab2;

import Exceptions.SingException;
import Interfaces.ISinger;
import Students.CivilStudent;
import Students.MilitaryStudent;
import Students.Student;

/**
 * Created by Mihaela Sorostinean on 10/26/2014.
 */
public class Main {
    public static void main(String[] args) {
        ISinger militaryStudent =new MilitaryStudent("John");
        Student civilStudent = new CivilStudent("Jack");

        try {
            militaryStudent.sing();
        } catch (SingException e) {
           System.out.println("Exception while trying to sing");
        }

        try {
            ((ISinger) civilStudent).sing();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
