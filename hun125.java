import java.util.*;
class hun125
{
    public static void main(String args[])
    {
        String s=args[0];
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub=s.substring(i,j+1);
                StringBuffer sb=new StringBuffer(sub);
                String sa=new String(sb.reverse());
                if(sub.equals(sa))
                {
                    if(sa.length()!=1)
                    {
                    System.out.println(sub);
                    }
                }
            }
        }
    }
}
