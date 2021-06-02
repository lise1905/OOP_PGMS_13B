import java.util.Scanner;
import java.io.*;
class metricadd
{
	public static void main(String arg[])
  	{
  		int r1,r2,c1,c2;
  		int a[][] = new int[10][10];
  		int b[][] = new int[10][10];
  		int c[][] = new int[20][20];
  		Scanner sc=new Scanner(System.in);
  		System.out.println("Enter the number of row in 1st metrix:");
  		r1=sc.nextInt();
  		System.out.println("Enter the number of colum in 1st metrix:");
  		c1=sc.nextInt();
  		System.out.println("Enter the number of row in 2nd metrix:");
  		r2=sc.nextInt();
  		System.out.println("Enter the number of colum in 2nd metrix:");
  		c2=sc.nextInt();
     		System.out.println("Enter the elements of first metric:");
  		for(int i=0;i<r1;i++)
   		{
    			for(int j=0;j<c1;j++)
    			{
      				a[i][j]=sc.nextInt();
     			}
    		}
  		System.out.println("First metric:");
  		for(int i=0;i<r1;i++)
   		{
    			for(int j=0;j<c1;j++)
    			{
      				System.out.print(a[i][j]+" ");
     			}
    			System.out.println();
    		}
  		System.out.println("Enter the elements of second metric:");
 		for(int i=0;i<r2;i++)
   		{
    			for(int j=0;j<c2;j++)
    			{
      				b[i][j]=sc.nextInt();
     			}
    		}
    		System.out.println("Second metric:");
  		for(int i=0;i<r2;i++)
   		{
    			for(int j=0;j<c2;j++)
    			{
       				System.out.print(b[i][j]+" ");
     			}
      			System.out.println();
    		}
  		for(int i=0;i<r1;i++)
   		{
    			for(int j=0;j<c1;j++)
    			{
       				c[i][j]=a[i][j]+b[i][j];
     			}
    		}
		System.out.println("Sum of the two metrices are:");
  		for(int i=0;i<r1;i++)
   		{
    			for(int j=0;j<c1;j++)
    			{
       				System.out.print(c[i][j]+" ");
     			}
     			System.out.println();
    		}
	}
}