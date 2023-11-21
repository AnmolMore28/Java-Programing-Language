import java.util.ArrayList;

public class PairSum1{
    // Bruteforce
//     public static boolean Bybruteforce(ArrayList<Integer>list, int Target){
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = i+1; j < list.size(); j++) {
//                 if (list.get(i)+ list.get(j)==Target) {
//         return true;            
//                 }
//             }
//         }
// return false;    } 
 
// 2 pointer aproch
public static boolean By2pointer(ArrayList<Integer> list, int Target){
     int lp =0; int rp = list.size()-1;
     while (lp!=rp) {
        if(list.get(lp)+list.get(rp)==Target){
            return true;
        }
        if (list.get(lp)+list.get(rp)<Target) {
            lp++;
        }
     else {
        rp--;        
    }
    }return false;
}
    
public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int Target =5;
        // System.out.println(Bybruteforce(list, Target));
  System.out.println(By2pointer(list, Target));      }
}