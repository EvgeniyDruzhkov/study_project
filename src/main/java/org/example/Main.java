package org.example;

import org.arrays.OperationsWithArrays;

public class Main {
    public static void main(String[] args) {

        OperationsWithArrays.printArray(OperationsWithArrays
                .sortIntegers(OperationsWithArrays
                        .getIntegers(OperationsWithArrays
                                .readInteger())));
        System.out.println("Min element " + OperationsWithArrays.findMin(OperationsWithArrays
                .readElements(OperationsWithArrays
                        .readInteger())));

    }
}