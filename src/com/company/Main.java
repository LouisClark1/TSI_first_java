package com.company;

public class Main {

    public static void main(String[] args) {

        byte Test_var = 127;
        Test_var = (byte) (Test_var +1);
        System.out.println(Test_var);

        double test_double = 55.7;
        int test_double_int = (int) test_double;
        System.out.println(test_double_int);

        float test_float = 2.66f;
        byte test_float2 = (byte)test_float;
        System.out.println(test_float2);
    }
}
