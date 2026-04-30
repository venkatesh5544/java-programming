/*one class three non static variables  without intailization then inatalize these variables while creating object display these variables under main method*/

import java.util.Scanner;
class C14
{
 static Scanner sc= new Scanner(System.in);
 int a ;
 String b ;
 Boolean c;

  C14(int x , String y, Boolean z )
{
  a = x;
  b = y;
  c = z;
}

 public static void main(String[] args)
{
 C14 x = new C14(sc.nextInt() , sc.next() , sc.nextBoolean() );
 System.out.println(x.a);
  System.out.println(x.b);
   System.out.println(x.c);

}
}

