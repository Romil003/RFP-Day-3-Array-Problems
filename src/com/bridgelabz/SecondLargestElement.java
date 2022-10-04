package com.bridgelabz;

public class SecondLargestElement {
    static void showArray(int[] arr){
        int a = arr.length;
        for (int i = 0 ; i< a ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void ascendingOrder(int[] arr){
        int a = arr.length;
        int c;

        for(int i = 0 ; i< a ; i++ ){
            for(int j = i+1 ; j<a; j++){
                if(arr[i]>arr[j]){
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }

        }
        System.out.println("Array in ascending order is : ");
        showArray(arr);
        System.out.println("Second largest number is : ");
        System.out.println(arr[arr.length-2]);
    }
    public static void main(String[] args) {
        int arr[] = new int[] {21,12,25,49,12,89,91,18,30,35};
        System.out.println("Given array is : ");
        showArray(arr);
        ascendingOrder(arr);
    }
}
