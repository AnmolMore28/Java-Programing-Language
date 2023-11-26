public class OOPS{ 
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
         System.out.println(p1.color);
    p1.setTip(2);
    System.out.println(p1.tip);
    // p1.setColor("Yellow");
    p1.color = "yellow";
   System.out.println(p1.color);

//  Student s1 = new Student();
//  Student s2 = new Student(s1);

            }
             }
            

               

class Student { 
    String name;
    int roll;
    String password;
Student (Student s1){
    System.out.println(" Ram Ram");

}
Student(){
System.out.println("Ram bhai Sarayanne!!! ");
}}
class Pen{
    String color;
    int tip;
     String getColor(){
        return this.color;
     }
     
void setColor(String newColor ){
    color =newColor;

} 
void setTip(int tip){
    this.tip = tip;
}
// void setTip(int newTip){
    // tip =newTip;gh

}
