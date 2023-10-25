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
    BankAccount myAcc =new BankAccount(); 
  myAcc.username="Anmol";
  myAcc.setPassword("AnmolkRam");;
}
    }
 class BankAccount{
  public String username;
         private String password;
   public void setPassword (String pwd){
    password=pwd;
   }
        }  
class Pen{
    String color;
    int tip;
void setColor(String newColor ){
    color =newColor;

}
void setTip(int newTip){
    tip =newTip;

}
}