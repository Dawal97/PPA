import java.lang.*;
import java.util.*;

class Marvellous
{
	public int srno;
	public String Batch;
	public int Fees;
	public int Months;
	
	public Marvellous(int a,String str,int b,int c)
	{
		this.srno=a;
		this.Batch=str;
		this.Fees=b;
		this.Months=c;
	}
	
	public void Display()
	{
		System.out.println(" Serial no : " +this.srno+ " Batch Name : " +this.Batch+ " Fees : " +this.Fees+ " Duration in months : " +this.Months);
	}
}

class StackMarvellous
{
	public static void main(String arg[])
	{
		Stack<Marvellous>obj=new Stack<Marvellous>();
		Marvellous m1=new Marvellous(1,"PPA",15000,3);
		Marvellous m2=new Marvellous(2,"LB",15000,4);
		Marvellous m3=new Marvellous(3,"ANGULAR",15000,5);
		Marvellous m4=new Marvellous(4,"LSP",15000,6);
		
		obj.push(m1);
		obj.push(m2);
		obj.push(m3);
		obj.push(m4);
		
		Marvellous ref=null;
		Iterator iob=obj.iterator();
		while(iob.hasNext())
		{
			ref=(Marvellous)iob.next();
			ref.Display();
		}
		
		System.out.println("POPPED ELEMENTS ARE:");
		
		ref=obj.pop();
		ref.Display();
		
		ref=obj.pop();
		ref.Display();
		
	}
}


















