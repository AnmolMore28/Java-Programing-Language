import java.util.ArrayList;
public class Arrayalists {
    public static void main(String args[]){

        
  ArrayList<Integer> list= new ArrayList<>();
//  ArrayList<String> list2 = new ArrayList<>();
//  ArrayList<Boolean> list3 = new ArrayList<>();
  
 list.add(2); //here complexity is O(1)
 list.add(5);
 list.add(9);
 list.add(6);
 list.add(8);
// // reverse Descending
// for (int i = list.size()-1; i >=0; i--) {
// System.out.print(list.get(i)+" ");
// }
//  System.out.println(list);
int max =Integer.MIN_VALUE;

for (int i = 0; i < list.size(); i++) {
  
if (max< list.get(i)) {
  max = list.get(i);
}}
System.out.println("max element = "+ max);
System.out.println();
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

}
}
