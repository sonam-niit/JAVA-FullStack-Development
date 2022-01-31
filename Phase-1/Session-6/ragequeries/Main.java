package com.simplilearn.ragequeries;

public class Main {

    public static void main(String args[]) 
    { 
        int arr[] = { 3, 7, 2, 5, 8, 9 }; 
        int n = arr.length;

        RangeQueries.buildSparseTable(arr, n); 
        System.out.println(RangeQueries.query(0, 5)); 
        System.out.println(RangeQueries.query(3, 5)); 
        System.out.println(RangeQueries.query(2, 4)); 
    } 

}
