import java.util.Arrays;
import java.util.*;
class tallest
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=ss.nextInt();
}
Arrays.sort(a);
System.out.println(a[n-4]);
System.out.print("Enter the number to find the tallest");
int k=ss.nextInt();
System.out.print(a[n-k]);
}
}
