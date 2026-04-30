/*one class which contains any   an instance variable and a parametrized condtructer invoke p c in main method and despay the value  of variable by providing dynamic inputs*/

import java.util.Scanner;
class C13
{
 static Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
  
 C13(Boolean a)
{
 System.out.println(a);
 System.out.println("parameterized constructor");
 
}
 public static void main(String[] args)
  {
  C13 x = new C13(sc.nextBoolean() );
  System.out.println(x.a);   
}

}