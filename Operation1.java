import java.util.*;

class Operation1
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int dividand,i,j;
    int divisor;
    int division;
 
   

	for(i=0;i<5;i++)
	{
	System.out.println("Enter the Dividand");
	dividand=sc.nextInt();
	

 	System.out.println("Enter the divisor :");
        divisor=sc.nextInt();
		
    

     try
      	{
	division=dividand/divisor;
	System.out.println("Division :"+division);  
	}

 	catch(Exception e)
    	{
	System.out.println(e);
	}

	}
}
}
