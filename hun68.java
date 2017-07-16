import java.util.*;
import java.lang.*;
class hun68
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        for(int i=0;i<args.length;i++)
        {
            al.add(Integer.parseInt(args[i]));
        }
        for(int j=0;j<al.size()-1;j++)
        {
            al1.add(Math.abs(al.get(j)-al.get(j+1)));
        }
        //System.out.print(al1);
        Collections.sort(al1);
        int n=al1.get(al1.size()-1);
        for(int i=0;i<al.size()-1;i++)
        {
            int a=al.get(i);
            int b=al.get(i+1);
            if(n==(a-b))
            {
                System.out.println(a+"-"+b+"="+n);
            }
        }
        
    }
}
