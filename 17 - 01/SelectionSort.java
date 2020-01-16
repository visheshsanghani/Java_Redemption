import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 9, 11, 4, 2, 15};
        System.out.println("Selection Sort : " + Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        int i = 0 , j =0 ;
        for(i = 0 ; i < arr.length - 1 ; i++){
            int min_i = i;
            for(j = i + 1 ; j < arr.length ; j++){
                if(arr[min_i] > arr[j]) {
                    min_i = j;
                }
            }

            int temp = arr[min_i];
            arr[min_i] = arr[i];
            arr[i] = temp;

        }

    return arr;
    }

}

