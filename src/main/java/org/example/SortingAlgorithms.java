package org.example;

public class SortingAlgorithms {

    private void printArr(int[] arr){
        for(int i=0; i<arr.length; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void bubbleSort(){
        int[] arr = {7, 8, 3, 1, 2};
        int n= arr.length;

        System.out.println("Original Array");
        printArr(arr);

        for(int i=0; i<n-1; ++i){
            for(int j=0; j<n-i-1; ++j){
                if(arr[j] > arr[j+1]){
                    arr[j]+=arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] -=arr[j+1];
                }
            }
        }

        System.out.println("Sorted Array (Ascending)");
        printArr(arr);

        for(int i=0; i<n-1; ++i){
            for(int j=0; j<n-i-1; ++j){
                if(arr[j] < arr[j+1]){
                    arr[j]+=arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] -=arr[j+1];
                }
            }
        }

        System.out.println("Sorted Array (Descending)");
        printArr(arr);
    }

    public void selectionSort(){
        int[] arr = {7, 8, 3, 1, 2};
        int n= arr.length;

        System.out.println("Original Array");
        printArr(arr);

        for(int i=0; i<n-1; ++i){
            int smallestEleIndex =i;
            for(int j=i; j<n; ++j){
                if(arr[j] < arr[smallestEleIndex]) smallestEleIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[smallestEleIndex];
            arr[smallestEleIndex]= temp;
        }

        System.out.println("Sorted Array (Ascending)");
        printArr(arr);

        for(int i=0; i<n-1; ++i){
            int LargestEleIndex =i;
            for(int j=i; j<n; ++j){
                if(arr[j] > arr[LargestEleIndex]) LargestEleIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[LargestEleIndex];
            arr[LargestEleIndex]= temp;
        }

        System.out.println("Sorted Array (Descending)");
        printArr(arr);
    }
}
