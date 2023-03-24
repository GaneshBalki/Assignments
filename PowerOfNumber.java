import java.util.Scanner;
class PowerOfNumber
 {
    int base,expo;
    public void acceptNumbers()
     {
       System.out.println("Enter The Number");
       Scanner sc= new Scanner(System.in);
       base=sc.nextInt();
       System.out.println("Enter The Power");
       expo=sc.nextInt();
     }
    public void power()
     { int result=1;
       for(int i=1;i<=expo;i++)
          {
             result=result*base;
          }
       System.out.println("The Answer is :"+result);
     }
    public static void main(String [] args)
     {
       PowerOfNumber po = new PowerOfNumber();
       po.acceptNumbers();
       po.power();
     }
 }