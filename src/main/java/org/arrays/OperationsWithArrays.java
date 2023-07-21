package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OperationsWithArrays {

    public static void main(String[] args) {

        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        printArray(sortIntegers(getIntegers(number)));

    }


    public static int[] getIntegers(int size) {
        int[] intArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("The perfect numbers are: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            intArray[i] = number;
        }

        return intArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + "contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        Arrays.sort(arr);
        int[] revArr = new int[arr.length];

        for (int i = 1; i < arr.length + 1; i++) {
            revArr[i - 1] = arr[arr.length - i];
        }

        return revArr;
    }
}
