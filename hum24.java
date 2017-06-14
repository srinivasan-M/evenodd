import java.util.*;
class hun24
{
  public static void main(String args[])
  {
    Scanner ss=new Scanner(System.in);
    System.out.print("enter the target number");
    int num=ss.nextInt();
    for(int i=0;i<args.length;i++)
    {
      for(int j=0;j<args.length;j++)
      {
        if(i!=j)
        {
          if(Integer.valueOf(args[i])+Integer.valueOf(args[j])==num)
          {
            System.out.println(args[i]+"  "+args[j]);
          }
        }
      }
    }
  }
}
