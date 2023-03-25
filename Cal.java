import java.util.Scanner;
class Cal+-
   {
     Scanner sc=new Scanner(System.in);
     int a;
     int b;
     public void disp()
      {
        a=sc.nextInt();
        b=sc.nextInt();
       }
       public void add()
        {
         System.out.println(a+b);
        }
       public void subtract()
        {
          System.out.println(a-b);
         }
       public void multiply()
         {
          System.out.println(a*b);
         }
       public void division()
          {
           System.out.println(a/b);
         }
    }
    public static void main(String args[])
        {
          Cal C=new Cal();
          C.disp();
          C.add();
          C.subtract();
          C.multiply();
          C.division();
        }