package LinearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int[] array = new int[] {1,2,3,4,5};
        int x = 14;
        System.out.println(linearSearch(array,x));
    }
    public static int linearSearch(int[]array, int x){
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == x){
                return array[i];
            }
        }
        return -1;
    }
}
