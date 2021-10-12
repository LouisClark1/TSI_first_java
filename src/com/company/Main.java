package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
/*
        byte Test_var = 127;
        Test_var = (byte) (Test_var +1);
        System.out.println(Test_var);

        double test_double = 55.7;
        int test_double_int = (int) test_double;
        System.out.println(test_double_int);

        float test_float = 2.66f;
        byte test_float2 = (byte)test_float;
        System.out.println(test_float2);*/

        int[] myNum = {10,20,30,40,2,3,4,5,6,7,8,6,5,4,3,2,1,5};
        System.out.println(Arrays.toString(myNum));


        for (int i = 0; i < 10; i++ ){  //this replaces the numbers with myNum with their indices
            myNum[i] = i;
        }
        System.out.println(Arrays.toString(myNum));

        int i = 0;
        for (int k: myNum){             // this loop adds 1 to each element. WOw!
            myNum[i] = k + 1;
            i++;

        }
        System.out.print(Arrays.toString(myNum));
    }
}
