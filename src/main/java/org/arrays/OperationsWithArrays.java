package org.arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class OperationsWithArrays {

    public static void main(String[] args) {

        printArray(sortIntegers(getIntegers(readInteger())));
        System.out.println("Min element " + findMin(readElements(readInteger())));

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
        reverse(arr);
        return arr;
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private static int readInteger() {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int num) {
        return getIntegers(num);
    }

    private static int findMin(int[] arr) {

        return Arrays.stream(arr)
                .filter(Objects::nonNull)
                .filter(s -> arr.length > 1)
                .min()
                .getAsInt();
    }
}
