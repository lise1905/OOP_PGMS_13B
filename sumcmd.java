public class sumcmd 
{
	public static void main(String args[]) 
	{
		int n=0,i;
		for(i=0;i<args.length;i++)
		{
   			n=n+Integer.parseInt(args[i]);
		}
		System.out.println("The sum is:"+n);
   	}
}
