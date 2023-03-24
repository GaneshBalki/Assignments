import java.util.Scanner;
class EvenNumber
  {  int a,b;
    public void acceptNumber()
     {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The First Number");
       a=sc.nextInt();
       System.out.println("Enter The Second Number");
       b=sc.nextInt();
     }
    public void findEvenNum()
     {
       
        for(int i=a;i<=b;i++)
          {
            if(i%2==0)
               {
                 System.out.println(i +"is Even Number");
               }
          }
     }
     
    public static void main(String[] args)
    {
      EvenNumber en = new EvenNumber();
      en.acceptNumber();
      en.findEvenNum();
    }
  }