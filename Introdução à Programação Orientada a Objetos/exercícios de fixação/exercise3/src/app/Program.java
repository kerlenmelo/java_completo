package app;

import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student newStudent = new Student();
        
        System.out.print("Enter the student name: ");
        String name = input.nextLine();
        newStudent.setName(name);
        
        System.out.println("Enter the notes: ");
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        input.nextLine();
        newStudent.setNota1(nota1);
        newStudent.setNota2(nota2);
        newStudent.setNota3(nota3);

        System.out.println("FINAL GRADE = " + String.format("%.2f",newStudent.somarNotas()));
        System.out.println(newStudent.calcularMedia());

        input.close();
    }
}
