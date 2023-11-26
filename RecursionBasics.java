public class RecursionBasics{
  
    public static void printDec(int n){
if(n == 1) {
    System.out.print(n);
    return ;
}
 System.out.print(n+" ");
printDec(n-1);
 //  decending(n-1);

}


// public static void PrintInc(int n ){
// if(n==1){ 
//     System.out.print(n+" ");
// return ;
// }
// PrintInc(n-1);
// System.out.print(n+" ");
// return ;
// }

// public static int fact(int n){
//  if (n==0 ) {
//     return 1;
// }
//     int fmn=fact(n-1);
// int fatorial =n *fmn;
// return fatorial;
// }
// public static int SumofNatural(int n){
//  if (n==0 ) {
//     return 1;
// }
    
// int fatorial =n + fact(n-1);
// return fatorial;
// }

// //Calculate nth term{


// public static int fib(int n){
// if (n == 0|| n == 1 ) {
// return n;    
// }
// int fnm1 =fib(n-1);
// int fnm2=fib(n-2);
// int fn =fnm1+fnm2;ss
// System.out.println(fn);
// return 1;


public static boolean isSortted(int arr[], int i){
    if (i==arr.length-1) {
        return true;
    }
    if (arr[i]> arr[i+1]) {
        return false;
    }
return isSortted(arr, i+1) ;
}
public static int Firstocurrence(int arr[], int i,int key){
    if(arr [i]==arr.length+1){
return -1;
    }   
     if (arr[i]== key) {
        return i;    }
    return Firstocurrence(arr, i+1, key);
}
public static int Lastocurrence(int arr[], int i,int key){

if( i == arr.length){
return -1;
    }
    int isFound = Lastocurrence(arr, i+1, key);
    if (isFound == -1 && arr[i]== key) {
        return i;
    }
return isFound;
}
public static int tillingproblem(int n){
// base
if (n ==0 || n==1) {
    return 1;
}
// kaam
// for verticall 
int fnm1= tillingproblem(n-1 );
//  for horizontal
int fnm2 = tillingproblem(n -2);

int totways = fnm1+ fnm2;
return totways;
}
public static void main (String []args  ) {
    // int n=10;
    // PrintInc(n);
//    printDec(n);
int key =2; 

int arr[]= {1,2,3,43,4,3,1,2,23,3,3,2};
// System.out.println(isSortted(arr, 0)); 
// System.out.println(Firstocurrence(arr, 0, key));
System.out.println(Lastocurrence(arr, 0, key));
System.out.println(tillingproblem(3));
}



}
