package MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length+arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) combined[index++] = arr1[i++];
            else combined[index++] = arr2[j++];
        }
        while( i < arr1.length) combined[index++] = arr1[i++];
        while( j < arr2.length) combined[index++] = arr1[j++];
        return  combined;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,7,8};
        int[] arr2 = {2,4,5,6};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
