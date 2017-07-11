import java.util.Collections;
import java.util.ArrayList;
class hun26
{
    public static ArrayList rev(ArrayList<Integer> al)
    {
        Collections.reverse(al);
        return al;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<args.length;i++)
        {
        al.add(Integer.parseInt(args[i]));
        }
        System.out.print("After reversing list:"+rev(al));
    }
}
