package SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public  static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minindex  = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            if(i != minindex){
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,6,5,1,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
