package com.bl.workshop1;

public class SameNumArray {

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5};
        int [] arr1 = new int[]{1,2,3,4,4,6};

        for (int i=0; i<=arr.length; i++){
            for (int j=0; j<=i; j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }

            }}
    }
}
