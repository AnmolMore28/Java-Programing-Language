import java.util.ArrayList;
public class Arrayalists {
  public static void swap(ArrayList<Integer>list, int idx1,int idx2){
int temp = list.get(idx1);
list.set(idx1, list.get(idx2));
list.set(idx2, temp);

}




  
  public static void main(String args[] ){

        
  //  ArrayList<Integer> list= new ArrayList<>();
//  ArrayList<String> list2 = new ArrayList<>();
//  ArrayList<Boolean> list3 = new ArrayList<>();
  
  // list.add(2); //here complexity is O(1)
  // list.add(5);
  // list.add(9);
  // list.add(6);
  // list.add(8);
// // reverse Descending
// for (int i = list.size()-1; i >=0; i--) {
// System.out.print(list.get(i)+" ");
// }
//  System.out.println(list);
// int max =Integer.MIN_VALUE;

// for (int i = 0; i < list.size(); i++) {
  
// if (max< list.get(i)) {
//   max = list.get(i);
// }}
// System.out.println("max element = "+ max);
// System.out.println();
 // list2.add("Raam Raam Bhai");

// System.out.println(list2);


// another type of adding/add opretation 
//  Raam.add(1, 354); // but here time complexity is O(n) which is not so good
// System.out.println(Raam);

// System.out.println(Raam.size());
//  to get a element
// int element =Raam.get(0);
// System.out.println(element);

// to remove a element
// Raam.remove(2);
// System.out.println(Raam);

// to set an element at index
// Raam.set(0, 32);
// System.out.println(Raam);

// Contains
// System.out.println(Raam.contains(1));
// System.out.println(Raam.contains(0));




// ArrayList<ArrayList<Integer>>mainlist =new ArrayList<>();
// ArrayList<Integer> list = new ArrayList<>();
// list.add(2);list.add(4);
//  mainlist.add(list);
 
//  ArrayList <Integer> list2 = new ArrayList<>();
//  list2.add(23);list2.add(5);
//  mainlist.add(list2);
 
//  for (int i = 0; i < mainlist.size(); i++) {
//   ArrayList<Integer> currentlist= mainlist.get(i);
//   for (int j = 0; j < currentlist.size(); j++) {
//     System.out.print(currentlist.get(j)+" ");
//   }System.out.println();
//  }System.out.println(mainlist);


/*  ex. is to add
list1 = 1,2,3,4,5.
list2 = 2,4,5,6,8,10
list3 = 3,6,9,12,15*/ 

// establish the main list
//  ArrayList<ArrayList<Integer>>mainlist =new ArrayList<>();
// //  cerating l1
// ArrayList<Integer> list1 = new ArrayList<>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>();
//  for (int i = 1; i <= 5; i++) {
//   list1.add(i*1);
//   list2.add(i*2);
//   list3.add(i*3);

//   }
// // Add it to mainlist
// mainlist.add(list1);
// mainlist.add(list2);
// mainlist.add( list3);
// System.out.println(mainlist);

// //printing loop
// for (int i = 0; i < mainlist.size(); i++) {
//    ArrayList<Integer> currentlist= mainlist.get(i);
//    for (int j = 0; j < currentlist.size(); j++) {
//      System.out.print(currentlist.get(j)+" ");
//    }System.out.println();
//  }System.out.println(mainlist);
   


// For Swapping

ArrayList<Integer> list= new ArrayList<>();
list.add(2); //here complexity is O(1)
  list.add(5);
  list.add(9);
  list.add(3);
  list.add(6);

 int idx1 =1,idx2=3;
 System.out.println(list);
swap(list, idx1, idx2);
System.out.println(list); } 
}
