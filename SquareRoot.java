import java.util.Scanner;
class SquareRoot
 { int num;
   double temp;
   public void acceptNumber()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Number..");
      num=sc.nextInt();
    }
   
   public void squarRoot()
    {
      double sr = num/2;
   
      do
       {
         temp=sr;
         sr=(temp+(num/temp))/2;
       }while((temp-sr)!=0);
    
      System.out.println("The Squreroot of "+num+" is"+sr);
    }
   
   public static void main(String[] args)
    {
      SquareRoot s = new SquareRoot();
      s.acceptNumber();
      s.squarRoot();
    }
 }