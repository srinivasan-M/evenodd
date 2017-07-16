import java.util.*;
class hun123
{
    public static void main(String args[])
    {
        String s=args[0];String res="";
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            String s2=String.valueOf(s1);
            int l=s.length()-s.replaceAll(s2,"").length();
            if(l==1)
            {
            res=res+s2;
            }
        }
        System.out.print(res);
    }
}
