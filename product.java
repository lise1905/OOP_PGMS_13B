import java.io.*;
import java.util.Scanner;
class pro
{ 
	int pcode;
	String pname;
	double price;
	void readdata()
	{
		Scanner p1 = new Scanner(System.in);
		System.out.println("Enter the Product code: ");
		pcode=Integer.parseInt(p1.nextLine());
  	 	System.out.println("Enter the product name: ");
		pname=p1.nextLine();
   		System.out.println("Enter the product price: ");
		price=p1.nextDouble();
   
 	}
 	void displaydata() 
 	{
  		System.out.println("Product code: "+pcode);
  		System.out.println("Product Name: "+pname);
   		System.out.println("Product Price: "+price);
  
  	}
}
class product
{
	public static void main(String args[])
	{
		Scanner p2=new Scanner(System.in);
		int n;
		System.out.print("Enter number of elements: ");
		n=p2.nextInt();
		pro p[]=new pro[n];
		for(int i=0;i<n;i++)
 		{
  			p[i]=new pro();
  			p[i].readdata();
  
 		}
 
 		int low=0;
 		for(int i=0;i<n;i++)
 		{
  
  			if(p[low].price>p[i].price)
  			{
  				low=i; 
     			}
  		}

		System.out.println("\nDetails of product having lowest price:");
		p[low].displaydata();


 	}
}