/* on class which contains two global variables one non static method m1 
having parameter and return type and default constructor then invoke all this properties 
under main method by provide dynamic inputs.*/


import java.util.Scanner;
class C11 
{
 static Scanner sc = new Scanner(System.in);
 static int a = sc.nextInt();
 int b = sc.nextInt();
 Boolean m1(String a)
 {
  System.out.println(a);
  return sc.nextBoolean();
 }
 C11()
 {
  System.out.println("hii");
 }
 public static void main(String[] args)
  {
   C11 x = new C11();
   System.out.println(x.a);
   System.out.println(x.b);
   System.out.println(x.m1(sc.next()) );
  }
 
}		