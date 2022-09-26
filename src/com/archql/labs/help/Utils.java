package com.archql.labs.help;

import java.util.Scanner;

public class Utils {
    public static Scanner scanner = new Scanner(System.in);

    public static double EPSILON = 1E-12;
    public static boolean realEquals(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }
    public static boolean realLessEquals(double a, double b) {
        return realEquals(a, b) || a < b;
    }
    public static boolean realGreaterEquals(double a, double b) {
        return realEquals(a, b) || a > b;
    }

    public static boolean lastInputValid = false;
    public static double readDouble(String varName)
    {
        double ret = 0.0;
            try {
                System.out.print("Input double " + varName + ": ");
                ret = scanner.nextDouble();
                lastInputValid = true;
            } catch (Exception e) {
                System.out.println("[Invalid input, set var = 0]");
                lastInputValid = false;
            }
        Utils.scanner.nextLine();
        return ret;
    }
    public static int readInt(String varName)
    {
        int ret = 0;
            try {
                System.out.print("Input int " + varName + ": ");
                ret = scanner.nextInt();
                lastInputValid = true;
            } catch (Exception e) {
                System.out.print("[Invalid input, set var = 0]");
                lastInputValid = false;
            }
        Utils.scanner.nextLine();
        return ret;
    }
    public static int[] readIntArray()
    {
        int len = Utils.readInt("array len");
        if (!Utils.lastInputValid || len <= 0) {
            return null;
        }

        // read
        int [] array = new int[len];
        for (int i = 0; i < len; i++)
        {
            array[i] = Utils.readInt("arr[" + i + "]");
        }
        return array;
    }

    public static boolean isPrime(int x)
    {
        if (x <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

}
