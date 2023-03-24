import java.util.Scanner;
class FibonacciSeries
  {  int a=0,b=1,c,d;
    public void acceptNumber()
     {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number");
       c=sc.nextInt();
     }
    public void fibonacci()
     {
       for(int i=1;i<=c;i++)
          {
            d=a+b;
            System.out.println(""+d);
            a=b;
            b=d;
          }
     }
     
    public static void main(String[] args)
    {
      FibonacciSeries fs = new FibonacciSeries();
      fs.acceptNumber();
      fs.fibonacci();
    }
  }