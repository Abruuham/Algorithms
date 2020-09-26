package com.abraham;


// Recursively person the Binary Search algorithm

public class BinarySearch {


    public static int binarySearch(int[] arr, int start, int size, int lookingFor){
        if (size >= 1){
            int mid = start + (size - start) / 2;

            // if the number we are looking for matches the mid point then return the index.
            if (lookingFor == arr[mid]){
                return mid;
            }

            // if the number we are looking for is smaller than the middle value of the
            // array then we ignore the right half and continue searching the left half of the array
            if (lookingFor < arr[mid]){
                return binarySearch(arr, start,mid - 1, lookingFor);
            }
            return binarySearch(arr, mid + 1, size, lookingFor);
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8, 9};
        int size = arr.length - 1;
        int start = 0;
        int lookingFor = 5;

        int ans = binarySearch(arr, start, size, lookingFor);

        if (ans != -1) {
            System.out.println("The number you are looking for was found at index: " + ans);
        }
        else {
            System.out.println("The number you are looking for does not exist in the array");
        }

    }
}
