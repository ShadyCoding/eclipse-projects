package MergeSort;

public class App {
    public static void main(String[] args){
        int[] inputArray = {9,5,3,7,1,2,4,6,8};
        
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
