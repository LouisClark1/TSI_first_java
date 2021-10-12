package com.company;
import java.util.Scanner;

public class Painter {
    public static void main(String[] args) {
        String answer_known_area = null;
        double wall_area = 0;
        double wall_height = 0;
        double wall_width = 0;
        boolean valid_answer = false;

        while (!valid_answer) {
            Scanner Question_know_area = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Do you know the area? answer Y or N");
            answer_known_area = Question_know_area.nextLine();  // Read user input

            if (answer_known_area.equals("Y") || answer_known_area.equals("N")) { // is the answer a valid one
                valid_answer = true;
            }
        }

        if (answer_known_area.equals("Y")) {
                Scanner question_what_area = new Scanner(System.in);
                System.out.println("What is the area in m^2?");
                wall_area = question_what_area.nextDouble();

        } else {
                System.out.println("Let's calculate the area then \nWhat is the average wall height in m?");
                Scanner question_wall_height = new Scanner(System.in);
                wall_height = question_wall_height.nextDouble();

                System.out.println("What is the length of walls in m?");
                Scanner question_wall_width = new Scanner(System.in);
                wall_width = question_wall_width.nextDouble();
                wall_area = wall_height * wall_width;
        }
        System.out.println("The wall area is " + wall_area + "m^2");
        System.out.println("How much area does the paint can say it will cover in m^2?");
        Scanner question_paint_coverage = new Scanner(System.in);
        double paint_coverage = question_paint_coverage.nextDouble();

        System.out.println("How many coats of paint will you do");
        Scanner question_coat_number = new Scanner(System.in);
        int coat_number = question_coat_number.nextInt();

        double can_number = wall_area / paint_coverage * coat_number;
        System.out.println("You will need " + can_number + "cans");
        if (!((can_number % 1) == 0)) {
            System.out.println("You will need " + can_number + "cans, which basically means you need " + (int) Math.ceil(can_number) + "cans");
        }
    }
}

