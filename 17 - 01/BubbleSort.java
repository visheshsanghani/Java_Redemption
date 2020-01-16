import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 9, 11, 4, 2, 15};
        System.out.println("Bubble Sort : "+Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        for(int i =0 ; i< arr.length ; i++){
            for (int j = 0 ; j < arr.length - i -1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }
}
