package com.company;

public class Arrays<i> {
    public static void main(String[] args) {
        int count = 0;
        int gridCounter[][] = new int[6][5];

        for (int i = 0; i < gridCounter.length; i++) {
            for(int j= 0; j < gridCounter[i].length; j++){
                gridCounter[i][j] = j*i;
                System.out.print(gridCounter[i][j]+" ");
            }
            System.out.println();
        }
    }
}
