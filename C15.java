/*one default constructor  and single pc , double pc , thrble pc,  non static 
variable invoke this under main method by dymanic inputs*/
import java.util.Scanner;
class C15 {
    static Scanner sc= new Scanner(System.in);
    int a = sc.nextInt(); 
    C15()
    {
     System.out.println("default c");
    }
    C15(String a)
    {
        System.out.println(a);
    }
    C15(int a , boolean b)
    {
        System.out.println(a +" "+ b);
    }
    C15(int a, String b , Boolean c)
    {
        System.out.println(a+" "+ b+" "+c);
    }

    public static void main(String[] args)
    {
        C15 x = new C15();
        System.out.println(x.a);
        new C15(sc.next());
        new C15(sc.nextInt(),sc.nextBoolean());
        new C15(sc.nextInt(), sc.next(), sc.nextBoolean());
    }

    
}
