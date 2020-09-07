package LinearSearch;

public class RecursiveLinearSearch {
    public static void main(String[] agrs){
        System.out.println(recursiveLinearSearch(new int[]{1,2,3,4,5,6},0,6));
    }
    public static int recursiveLinearSearch(int[] a, int i, int x){
        if (i > a.length - 1){
            System.out.print("Desired number not found: ");
            return -1;
        }else if (a[i] == x){
            System.out.print("Number found at index position: ");
            return i;
        }else {
            System.out.println("index at: "+i);
            return recursiveLinearSearch(a, i + 1, x);
        }
    }
}
