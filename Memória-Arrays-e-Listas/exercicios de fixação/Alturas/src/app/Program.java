package app;

import java.util.Scanner;

import entities.Person;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people will be entered: ");
        int num = input.nextInt();
        input.nextLine();

        Person[] vect = new Person[num];
        
        double sumHeight = 0.0;
        double ageUnder = 0.0;
        String nameUnderAge = "";
        
        for (int i = 0; i < num; i++) {
            System.out.printf("Data from %dª person: %n", i+1);
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("Height: ");
            double height = input.nextDouble();
            input.nextLine();
            Person person = new Person(name, age, height);
            vect[i] = person;
            sumHeight += height;
            if (age < 16) {
                ageUnder += 1;
                nameUnderAge += name+" ";
            }
        }
        
        double avg = sumHeight / num;
        double percentage = (ageUnder / num) * 100;
        
        System.out.printf("%nAverage age: %.2f%n", avg);
        System.out.printf("People under 16: %.1f %%%n",percentage);
        System.out.println(nameUnderAge);

        input.close();
    }
}
