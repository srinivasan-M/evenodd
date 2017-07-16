import java.util.*;
import java.lang.*;
class hun129
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        String s=args[0];int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int n=(int)c;
            al.add(n);
        }
        for(int i=0;i<al.size()-1;i++)
        {
            int diff=al.get(i+1)-al.get(i);
            sum+=diff;
        }
        char res=(char)(Math.abs(sum-(al.get(0))));
        System.out.print(res);
    }
}
