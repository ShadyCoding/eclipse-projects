package QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArray = {12, 81, 74, 43, 1098, 0, 8,11,33};
        quickSort(inputArray, 0, inputArray.length-1);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void quickSort(int[] inputArray, int start, int end){
        if (start < end){
            int pp = partition(inputArray, start, end);
            quickSort(inputArray, start, pp-1);
            quickSort(inputArray, pp+1, end);
        }
    }

    private static int partition(int[] inputArray, int start, int end) {
        int pivot = inputArray[end];
        int i = start-1;
        for (int j = start; j < end-1; j++) {
            if (inputArray[j] <= pivot){
                i++;
                // Swapping values
                int ivalue = inputArray[i];
                int jvalue = inputArray[j];
                inputArray[i] = jvalue;
                inputArray[j] = ivalue;
            }
        }
        // put the pivot point in the correct slot
        int ivalue = inputArray[i+1];
        inputArray[end] = ivalue;
        inputArray[i+1] = pivot;
        return i+1;
    }
}
