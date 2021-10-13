package com.company;

import java.util.ArrayList;
import java.util.List;

public class Arrays<i> {
    public static void main(String[] args) {
        int count = 0;
        int gridCounter[][] = new int[10][10];

        for (int i = 0; i < gridCounter.length; i++) {
            for(int j= 0; j < gridCounter[i].length; j++){
                gridCounter[i][j] = ++count;
                System.out.print(gridCounter[i][j]+" ");
            }
            System.out.println();
        }

        //i want to print line x
        int print_row = 3; //which row to print
        System.out.println("\nThis should be the number " + print_row + " row");
        for (int L = 0 ; L < gridCounter[print_row - 1].length ; L++){
            System.out.print(gridCounter[print_row - 1][L] + " ");
        }


        //i want to print column x
        int print_column = 3; //which row to print
        System.out.println("\nThis should be the " + print_column +" column");
        for (int L = 0 ; L < gridCounter.length ; L++){
            System.out.print(gridCounter[L][print_column - 1] + " ");
        }

        List <String> group_of_things = new ArrayList<>();
        System.out.println();
        group_of_things.add("Louis");
        group_of_things.add("Louis1");
        group_of_things.add("Louis2");
        group_of_things.add("Louis3");
        group_of_things.add("Louis4");
        group_of_things.add(1,"Louis_different");

        System.out.println(group_of_things);
        System.out.println("The index in the group of Louis is " + group_of_things.indexOf("Louis"));



    }
}
