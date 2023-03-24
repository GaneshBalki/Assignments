import java.util.Scanner;
class Palindrome
  {  int num;
    public void acceptNumber()
     {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number");
       num=sc.nextInt();
       
     }
    public void findPalindrome()
     {
       int org_num=num;
       int rev=0;
       while(num!=0)
          {
            rev=rev*10+num%10;
            num=num/10;
          }
       if(org_num==rev)
          {
            System.out.println("Entered Number "+org_num+" is palindrome");
          }
       else
          {
            System.out.println("Entered Number "+org_num+" is not palindrome");
          }
     }
     
    public static void main(String[] args)
    {
      Palindrome pd = new Palindrome();
      pd.acceptNumber();
      pd.findPalindrome();
    }
  }