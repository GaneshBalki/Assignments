import java.util.Scanner;
class SumN
{
 public static void main(String[] args)
  { int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter How Many Numbers Want to Add");
    int n=sc.nextInt();
    
    int array[] = new int[n];
    
    for(int i=0;i<n;i++)
     { 
       System.out.println("enter  number  "+(i+1)+":");
       array[i]=sc.nextInt();
     }
  
    for(int i=0;i<n;i++)
     {
       sum=sum+array[i];
     }
    System.out.println("Sum is :"+sum);
  }




} 