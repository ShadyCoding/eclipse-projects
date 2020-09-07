package BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args){
        //important: array must be sorted in Binary Search
        System.out.println(recursiveBS(new int[]{1,2,3,4,5},0,4, 11));
    }
    public static int recursiveBS(int[]a, int p, int r, int x){
        if (p > r){
            System.out.print("Desired number not found: ");
            return -1;
        }else{
            int q = (p+r)/2;
            if (a[q] == x){
                return q;
            }else if (a[q] > x) {// that's mean x is on the left side
                recursiveBS(a, p, q - 1, x);// we to search in first half, so r = q-1 which the end of the range
            }else {
                return recursiveBS(a, q+1, r, x);
            }
        }
        return -1;
    }
}
