package SelectionSort;

public class SelectionSort {
    public static void main(String[] args){
        int[] myArray = SelectionSort(new int[]{23,3,33,13,43});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }

    public static int[] SelectionSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            //System.out.println(min);
            for (int j=i+1; j < a.length; j++ ) {
                if (a[j] < a[min]) {
                    min = j;
                    //System.out.println(min);
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

}
