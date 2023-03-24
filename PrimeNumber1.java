import java.util.Scanner;
class PrimeNumber1 {
        int num;
    public void acceptNumber()
        {
          System.out.println("Enter The Number..");
          Scanner sc = new Scanner(System.in);
          num=sc.nextInt();  
        }
    public void checkPrime()
        {
          boolean isPrime = true;
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) 
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
        {
            System.out.println(num + " is a prime number");
        } 
        else 
        {
            System.out.println(num + " is not a prime number");
        }  
        }  
    public static void main(String[] args) 
    {
        PrimeNumber1 pr = new PrimeNumber1();
        pr.acceptNumber();
        pr.checkPrime();
        
    }
}