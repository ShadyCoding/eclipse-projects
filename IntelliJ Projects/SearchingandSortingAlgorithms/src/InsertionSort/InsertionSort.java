package InsertionSort;

public class InsertionSort {
    public static void main(String[] args){
        int[] myArray = insertionSort(new int[]{9,8, 99, 110, 8, 87});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] insertionSort(int[]a){
        /*
        * Insertion Sort Algorithm
        * int[] IS(int[]a)
        * for i = 1 to a.length -1
        * A. set element to a[i], and set j = i-1
        * B. while j>=0 and a[j]>element:
        *       a. set a[j+1] to a[j]
        *       b. decrement j by 1
        * C. set a[j+1] to element
        *
        * */
        for (int i = 1; i < a.length; i++) {
            int element = a[i];//element variable contain the data we intend on bringing over to the sorted area
            int j = i-1;// j variable points to the index position of the last value in the sorted area
            while (j >= 0 && a[j] > element){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }
        return a;
    }
}
