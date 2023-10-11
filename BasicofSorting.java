import java.util.*;
import java.util.Collections;


public class BasicofSorting {
   public static void bubblesort(int arr[]){
        for (int turn = 0; turn < arr.length-1; turn++) {
           for (int i = 0; i < arr.length-1-turn; i++) {
            if (arr[i]> arr [i+1]) {
                //swap
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr [i+1]=temp;
                
            } 
           } 
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    
        }
System.out.println();    }
public static void selectionSort( int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
       int minPos= i;
        for (int j = i+1; j<arr.length; j++) {
        if (arr[minPos]>arr[j]) {
         minPos =j;   
        }}//swap
int temp = arr[minPos];
arr[minPos]=arr[i];
arr[i]= temp;  
  }
}
public static void insertionSort(Integer arr[]){
    for (int i = 1; i < arr.length; i++) {
        int curr =arr[i];
        int prev = i-1;
        while (prev >= 0&& arr[prev]>curr) {
            arr[prev+1]= arr [prev];
prev--;        }
    arr[prev+1] =curr;}}
   
   
    public static void countingsort(int arr []){
    int largest = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
  largest = Math.max(largest,arr [i]);
}
int count[] = new int[largest+1];
for (int i = 0; i < count.length; i++) {
      count[arr[i]]++;    
}
//  sortinng
int j=0;
 for (int i = 0; i < count.length; i++) {
    while (count[i]>0) {
        arr[j]=i;
        count[i]--;
    }
 }
}
 
   public static void main(String args[]) {
        int arr []={2,1,3,6,7};
        //  inbuilt array
        // Arrays.sort(arr,0,6);
        // Arrays.sort(arr,0,6,Collections.reverseOrder() );
        countingsort(arr);   
        printArr(arr); 

  }
}




