import java.util.*;
class hun28
{
    public static void main(String args[])
    {
        LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
        Scanner ss=new Scanner(System.in);
        String s=ss.next();
        //String s1="";
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
            hs.add(c);
        }
        for(char c:hs)
        {
        System.out.print(c);
    }  
    }
}
