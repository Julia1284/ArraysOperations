package ru.yulialyapushkina.arraysOperations._main;

import ru.yulialyapushkina.arraysOperations.util.ArraysOperation;

public class _Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        int[] arr1 = new int[]{9, 2, -6, 54, 32, 7, 1, 0, 25, -3};
        System.out.println(ArraysOperation.calcEvenNumbers(arr));
        System.out.println(ArraysOperation.calcOddNumbers(arr));
        System.out.println(ArraysOperation.calcPrimeNumbers(arr));
        System.out.println(ArraysOperation.calcSumNumbers(arr));
        System.out.println(ArraysOperation.calcDiffEvenOdd(arr));
        System.out.println(ArraysOperation.checkZero(arr));
        ArraysOperation.sortBubble(arr);
        ArraysOperation.sortBubble(arr1);
    }
}


