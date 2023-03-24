import java.util.Scanner;
class Area
  {  int lenght,breadth;
     public void acceptVal()
      { 
        
        System.out.println("Enter The Lenght of Rectangle..");
        Scanner sc = new Scanner(System.in);
        lenght=sc.nextInt();
        System.out.println("Enter The Breadth of Rectangle..");
        breadth=sc.nextInt();
      }
     public void areaFormula()
      {
        int ans=lenght*breadth;
        System.out.println("The Area Of Rectangle is :"+ans);
      }
     public static void main(String[] args)
      {
        Area a = new Area();
        a.acceptVal();
        a.areaFormula();
      }
  }