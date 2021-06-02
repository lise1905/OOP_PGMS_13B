import java.util.Scanner;
class sort
{
    public static void main(String[] args) 
    {
        int n,i;
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        n=s.nextInt();
        String str[] = new String[n];
        System.out.println("Enter elements:");
	Scanner s1=new Scanner(System.in);
        for(i=0;i<n;i++)
        {
            str[i]=s1.nextLine();
	}
	for(i=0;i<n;i++) 
        {
	for(int j=i+1;j<n;j++)
	{
            if(str[i].compareTo(str[j])>0) 
            {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
             }
        }
	}
        System.out.print("Elements are:");
        for(i=0;i<n;i++) 
        {
            System.out.print(str[i]+",");
        }
    }
}
