package ru.yulialyapushkina.arraysOperations._main;

import ru.yulialyapushkina.arraysOperations.util.ArraysOperation;

public class _Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
        System.out.println(ArraysOperation.evenNumber(arr));
        System.out.println(ArraysOperation.oddNumber(arr));
        System.out.println(ArraysOperation.primeNumber(arr));
        System.out.println(ArraysOperation.sumNumbers(arr));
    }
}


