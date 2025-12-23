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

    private static void quickSortHelper(int[] arr, int left , int right){
        if(left < right) {
            int pivotIndex = pivot(arr, left, right);
            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }

    }
    public static void quickSort(int[] arr){
        quickSortHelper(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] myArray = {4,6,1,7,3,2,5};
        quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
