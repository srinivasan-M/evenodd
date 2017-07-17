import java.util.*;
import java.util.ArrayList;
class hun128
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<args.length;i++)
        {
            al.add(Integer.parseInt(args[i]));
        }
        Collections.sort(al);
        for(int i=al.size()-1;i>=(al.size()/2);i--)
        {
            System.out.print(al.get(i));
            if(j!=al.size()/2)
            {
            System.out.print(al.get(j)+" ");
            }
            j++;
        }
    }
}
