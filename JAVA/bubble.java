import java.util.Scanner;

public class bubble
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner (System.in);
    int n;
   
    System.out.print("\n Enter Size of Array\n");
    n=sc.nextInt();
    int [] a=new int[n];
    System.out.print("GIVE NUMBERS FOR ARRAY (separated by spaces):");
    for( int i=0;i<=n-1;i++)
    {   
        a[i]=sc.nextInt();
    }
    int k,grt;
    for(int y=n-1;y>=0;y--)
    {
    for(int i=1;i<=y;i++)
    {   
        
        k=i-1;
        if(a[i]<a[k])
        {
            grt=a[k];
            a[k]=a[i];
            a[i]=grt;
        }
    }}
    System.out.print("\n SORTED OUTPUT \n");
    for( int i=0;i<=n-1;i++)
    {
        System.out.printf("%d ",a[i]);
    }
    }}
