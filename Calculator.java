import java.util.Scanner;
class Calculator
  {   int num1,num2;

    public void acceptNumbers()
     { 
       System.out.println("Enter The First Number.");
       Scanner sc = new Scanner(System.in);
       num1=sc.nextInt();
       System.out.println("Enter The Second Number..");
       num2=sc.nextInt();
     }
    public void sumOfNumbers()
     {
        int z=num1+num2;
        System.out.println("The sun of two Number is :"+ z);
     }
    public void subOfNumbers()
     {
        int y=num1-num2;
        System.out.println("The substraction of two Number is :"+ y);
     }
    public void multiOfNumbers()
     {
        int x=num1*num2;
        System.out.println("The multiplication of two Number is :"+ x);
     }
    public void divOfNumbers()
     {
        int w=num1/num2;
        System.out.println("The sun of two Number is :"+ w);
     }
    public static void main(String[] args)
     {
        Calculator c = new Calculator();
        c.acceptNumbers();
        //c.sumOfNumbers();
        
        int choice; 
        System.out.println("**Choose The Operation By Sequence**");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplition");
        System.out.println("4. Division");
        Scanner sc = new Scanner(System.in);
        choice=sc.nextInt();
       switch(choice)
        {
             case 1: c.sumOfNumbers();
               break;
             case 2: c.subOfNumbers();
               break;
             case 3: c.multiOfNumbers();
               break;
             case 4: c.divOfNumbers();
               break;
             default: System.out.println("Invalit Responce....");
        }
     }

  }
















