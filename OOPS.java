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