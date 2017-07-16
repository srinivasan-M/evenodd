import java.util.*;
class hun75
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<args.length;i++)
        {
            al.add(Integer.parseInt(args[i]));
        }
        if(al.size()!=0)
        {
            for(int j=0;j<al.size();j++)
            {
                if(j==al.size()-1)
                {
                    System.out.print("-1");
                }
                else if(al.get(j)>al.get(j+1))
                {
                    System.out.print(al.get(j+1));
                }
                else if(al.get(j)<al.get(j+1))
                {
                System.out.print("-1");
                }
            }
        }
        else
          System.out.print("Array is empty..!!!");
    }
}
