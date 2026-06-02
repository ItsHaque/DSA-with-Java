package org.example;

public class SortingAlgorithms {
    public void bubbleSort(){
        int[] arr = {7, 8, 3, 1, 2};
        int n= arr.length;

        System.out.println("Original Array");
        for(int i=0; i<n; ++i) System.out.print(arr[i] + " ");

        for(int i=0; i<n-1; ++i){
            for(int j=0; j<n-i-1; ++j){
                if(arr[j] > arr[j+1]){
                    arr[j]+=arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] -=arr[j+1];
                }
            }
        }

        System.out.println("\nSorted Array (Ascending)");
        for(int i=0; i<n; ++i) System.out.print(arr[i] + " ");

        for(int i=0; i<n-1; ++i){
            for(int j=0; j<n-i-1; ++j){
                if(arr[j] < arr[j+1]){
                    arr[j]+=arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] -=arr[j+1];
                }
            }
        }

        System.out.println("\nSorted Array (Descending)");
        for(int i=0; i<n; ++i) System.out.print(arr[i] + " ");
    }
}
