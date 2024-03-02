package ru.yulialyapushkina.arraysOperations.util;

public class ArraysOperation {
    public static int calcEvenNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int calcOddNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
// Простое число -  натуральное число является простым, если оно отлично от 1 и делится без остатка только на 1 и на само себя.

    private static boolean isSimple(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calcPrimeNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isSimple(arr[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static int calcSumNumbers(int[] arr) {
        int sumResult = 0;
        for (int i = 0; i < arr.length; i++) {
            sumResult += arr[i];
        }
        return sumResult;
    }

    public static int calcDiffEvenOdd(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        return sumEven - sumOdd;
    }

    public static int checkZero(int[] arr) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        return countZero;
    }

    public static void sortBubble(int[] arr) {
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}


