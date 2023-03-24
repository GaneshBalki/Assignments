import java.util.Scanner;

class Swap
  {
    int x,y;
    public void acceptNumber()
     {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter The Firt Number x");
       x = s.nextInt();
       System.out.println("Enter The Second Number y");
       y = s.nextInt();
     }
    public void swap()
     {
       x=x+y;
       y=x-y;
       x=x-y;
      System.out.println("Value of x is :"+ x + " Value of y :"+y);
     }
    public static void main(String[] args)
     {
       Swap s = new Swap();
       s.acceptNumber();
       s.swap();
     }   
  }