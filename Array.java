import java.util.Scanner;
public class Array {

 public static void main(String[] args) 
 {

 
  
  int[] numbers = new int[10];
  Scanner sc = new Scanner(System.in);  
  System.out.println("Enter elements of the array: ");  
  
  for(int i=0; i<10; i++)  
   {  
  
    numbers[i]=sc.nextInt();  
   }  

  int smallest = numbers[0];
  int largest = numbers[0];

  for (int i = 1; i < numbers.length; i++) 
  {
   if (numbers[i] > largest)
    largest = numbers[i];

   else if (numbers[i] < smallest)
    smallest = numbers[i];
  }

  System.out.println("Largest Number is : " + largest);
  System.out.println("Smallest Number is : " + smallest);
 }
}