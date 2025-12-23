package QuickSort;

import java.util.Arrays;

public class QuickSort {
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int pivot(int[] arr, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex+1; i <= endIndex; i++){
            if(arr[i] < arr[pivotIndex]){
                swapIndex++;
                swap(arr, swapIndex, i);

            }
        }
        swap(arr, swapIndex, pivotIndex);
        return swapIndex;
    }

    public static void main(String[] args) {
        int[] myarr = {4,6,1,7,3,2,5};
        int returnIndex = pivot(myarr, 0,6);
        System.out.println("Return index: "+ returnIndex);
        System.out.println(Arrays.toString(myarr));
    }
}
