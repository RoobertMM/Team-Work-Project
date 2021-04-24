package com.company;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Marian","Informatica",30,2.5);

        Teacher teacher1 = new Teacher("Constantinopol","Istorie",56, 1.0);

        Students students = new Students("Gabi","D","Engleza",7.2f,3f);

        System.out.println(teacher);

        System.out.println("\n");

        System.out.println(teacher1);

        System.out.println("\n");
        students.mediaAnuala();
        System.out.println(students);
    }
}
