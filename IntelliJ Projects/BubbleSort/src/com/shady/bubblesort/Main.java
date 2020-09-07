package com.shady.bubblesort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1 - 22};
        for (int unSortedIndex = intArray.length - 1; unSortedIndex > 0; unSortedIndex--) {
            for (int i = 0; i < unSortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
//                    int temp = intArray[i];
//                    intArray[i] = intArray[i + 1];
//                    intArray[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j)//2==2
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
