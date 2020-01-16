import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 9, 11, 4, 2, 15};
        System.out.println("Insertion Sort : "+ Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        int i , j , key;
        for(i =1;i<arr.length;i++){
            key = arr [i];
            j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        return arr;

    }
}
