package MergeSort;

public class MergeSort {

    public static void sort(int[] inputArray){
        sort(inputArray, 0, inputArray.length-1);
    }
    public static void sort(int[] inputArray, int start, int end){
        if (end <= start){
            return;
        }
        int mid = (start+end)/2;
        sort(inputArray, start, mid);
        sort(inputArray, mid+1, end);
        merge(inputArray, start, mid, end);
    }

    private static void merge(int[] inputArray, int start, int mid, int end) {
        int[] tempArray = new int[end - start+1];
        int leftSort = start;
        int rightSort = mid+1;
        int k = 0;
        while (leftSort <= mid && rightSort <= end){
            if (inputArray[leftSort] < inputArray[rightSort]){
                tempArray[k] = inputArray[leftSort];
                leftSort++;
            }else {
                tempArray[k] = inputArray[rightSort];
                rightSort++;
            }
            k++;
        }
        /**
         * when it gets to here, that means the above loop is completed
         * so both the left and right of the sub-array can be considered sorted
         */
        if (leftSort <= mid){
            while (leftSort <= mid){
                tempArray[k] = inputArray[leftSort];
                leftSort++;
                k++;
            }
        }else if (rightSort <= end) {
            while (rightSort <= end){
                tempArray[k] =inputArray[rightSort];
                rightSort++;
                k++;
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            inputArray[start+i] = tempArray[i];
        }
    }
}
