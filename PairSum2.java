import java.util.ArrayList;

public class PairSum2{
   // 2 pointer aproch
   public static boolean By2pointer(int Target, ArrayList <Integer> list){
 int Bp=-1;
 int n = list.size();
        for (int i = 0; i < list.size(); i++) {
         if (list.get(i)>list.get(i+1)) { //breaking point
            Bp =i ;
            break;
         }
        }
   int lp =Bp+1; // Smallest
  int rp = Bp;   // largest
while (lp!=rp) {
   // case1
   if (list.get(rp)+ list.get(lp)==Target) {
      return true;
   }
if (list.get(rp)+ list.get(lp)<Target) {
   lp = (lp+1)%n;
    } else{
      rp = (n+rp-1)%n;
    }
 }

      return false;
   } 
     public static void main (String args[]){
      // Find if any pair in a sorted & Rotated ArrayList has a target sum  
      ArrayList <Integer> list= new ArrayList<>();
      //   list =[11,15,6,8,9,10], Target =16 
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9); 
        list.add(10);        
        int Target =16;
          System.out.println(By2pointer(Target, list));
      }
        
}