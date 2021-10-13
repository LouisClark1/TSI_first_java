package com.company;


public class Methods_example {
    public static void main(String[] args) {

        double a = 10;
        double b = 15;
        double c = 9;

        double V = volumeCalculator(a,b,c);
        System.out.println(V);

        int count = 0;
        int gridCounter[][] = new int[10][10];

        for (int i = 0; i < gridCounter.length; i++) {
            for(int j= 0; j < gridCounter[i].length; j++){
                gridCounter[i][j] = ++count;
                System.out.print(gridCounter[i][j]+" ");
            }
            System.out.println();
        }
        int[][] blankArray = transposeArray(gridCounter);
    }

    public static double volumeCalculator(double vol1, double vol2,double vol3){
        double vol = vol1 * vol2 * vol3;
        return vol;
    }

    
    //this is the method that transposes the array and prints it
    public static int[][] transposeArray(int methodArray[][]){
        int tempArray[][] = new int[methodArray[0].length][methodArray.length];
        for (int i = 0; i < methodArray.length; i++) {
            for (int j = 0; j < methodArray[i].length; j++) {
                tempArray[i][j] = methodArray[j][i];
                System.out.print(tempArray[i][j] + " ");
            }
            System.out.println();

        }
    return methodArray;
    }

}
