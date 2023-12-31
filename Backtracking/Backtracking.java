public class Backtracking {
// Find sub set
public static void findSubsets(String str,int i, String ans){
  // base case
  if (i == str.length()) {
    // recursion
  if (ans.length() == 0) {
    System.out.println("null");
  } else { 
    System.out.println(ans);
  }return;}
  // yes choices
  findSubsets(str, i+1, ans+str.charAt(i));
// no choices
findSubsets(str, i+1, ans);
}

public static void findPermutation(String str,String ans){
if (str.length()==0) {
  System.out.println(ans);
  return; 
}
  for (int i = 0; i < str.length(); i++) {
 char curr= str.charAt(i);
 String Newstr =str.substring(0,i)+str.substring(i+1);
 findPermutation(Newstr, ans+curr);
}
 }

 public static void main(String[] args) {
 String str = "abc";
// findSubsets(str, 0, "");
findPermutation(str, "" );
 }
}