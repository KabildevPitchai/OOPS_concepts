public class Myclass 
{
 static String name="kabildev"; //Static variable [class specific]
 String name1="dev"; //non static variable or instance variable [object specific]

 public static void main(String[] args) 
 {
  String name2="kabil"; //Local variable
  Myclass mc = new Myclass();
  
  //Ways to access static variable
  System.out.println(name);
  System.out.println(Myclass.name);
  System.out.println(mc.name);
  
  //Ways to access non static or instance variable
  System.out.println(mc.name1);
  //System.out.println(Myclass.name1); does not compile
  //System.out.println(name1); does not compile
  
  //Ways to access local variable
  System.out.println(name2);
  //System.out.println(mc.name2); does not compile
  //System.out.println(Myclass.name2); does not compile
  
 }
 

}
