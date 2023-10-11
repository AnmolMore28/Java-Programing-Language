public class RecursionBasics{
  
    public static void printDec(int n){
if(n==1) {
    System.out.println(n);
    return;
}
 System.out.print(n+" ");
//  decending(n-1);
}


public static void printInc(int n ){
if(n==1){ 
    System.out.print(n+" ");
return;
}
printInc(n-1);
System.out.print(n+" ");
}

public static int fact(int n){
 if (n==0 ) {
    return 1;
}
    int fmn=fact(n-1);
int fatorial =n *fmn;
return fatorial;
}
public static int SumofNatural(int n){
 if (n==0 ) {
    return 1;
}
    
int fatorial =n + fact(n-1);
return fatorial;
}

//Calculate nth term{


public static int fib(int n){
if (n == 0|| n == 1 ) {
return n;    
}
int fnm1 =fib(n-1);
int fnm2=fib(n-2);
int fn =fnm1+fnm2;
System.out.println(fn);
return 1;
// public static boolean isSortted(int arr[], int
// }

}
public static void main (String args [] ) {
    int n=5;
    System.out.println(fact(n));
}


}
