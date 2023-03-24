import java.util.Scanner;
class Factorial
  {  int a;
    public void acceptNumber()
     {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number");
       a=sc.nextInt();
 
     }
    public void findFactorial()
     { int fact=1;
       
        for(int i=1;i<=a;i++)
          {
            fact=fact*i;
          }
        System.out.println("The Factorial is :"+fact);
     }
     
    public static void main(String[] args)
    {
      Factorial fc = new Factorial();
      fc.acceptNumber();
      fc.findFactorial();
    }
  }