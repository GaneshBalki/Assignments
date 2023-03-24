import java.util.Scanner;
class CompoundInterest
  {
    double principle,rate,time,far1,amt,ci;
    double result=1;
    public void acceptValues()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Principle Amount..");
      principle=sc.nextDouble();
      System.out.println("Enter The Rate of Interest");
      rate=sc.nextDouble();
      System.out.println("Enter The Time Period in Years");
      time=sc.nextDouble();
    }

    public void formula1()
    {
      far1=(1+rate/100);
    }

    public void power()
     { 
       for(int i=1;i<=time;i++)
          {
             result=result*far1;
          }
     }

    public void formula2()
    {
      amt= principle*result;
      ci=amt-principle;
     System.out.println("The Compound Interest Is :"+ci);

    }

    public static void main(String[] args)
    {
      CompoundInterest cd = new CompoundInterest();
      cd.acceptValues();
      cd.formula1();
      cd.power();
      cd.formula2();

    }
  }