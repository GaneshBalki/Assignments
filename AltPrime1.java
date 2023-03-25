
class AltPrime1{

public static void main(String[] args){


int num;
for(num=2;num<=100;num++ )
{
	int count=0;
    if(num>1)
    {
for(int i=1;i<=num;i++)
{
     if(num%i==0)
    {
    count++;
    }
}
  if(count==2)
    {
	System.out.println("prime"+num);
    num++;
	}


	}	

}



}
}