import java.util.*;
class som
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int rows=ss.nextInt();
int cols=ss.nextInt();
int[][] a=new int[rows][cols];
int sum=0;
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
a[i][j]=ss.nextInt();
System.out.print(" ");
}
}
System.out.println("Entered matrix is:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");
}
for(int j=0;j<cols;j++)
{
	sum=sum+a[j][1];
}
System.out.print("sumof middle numbers are:"+sum);
}
}
