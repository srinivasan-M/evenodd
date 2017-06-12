import java.util.*;
class longwith
{
public static void main(String args[])
{
HashSet<String> hs=new HashSet<String>();
HashSet<Character> hs1=new HashSet<Character>();
ArrayList<Integer> al=new ArrayList<Integer>();
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
int len=s.length();
for(int i=0;i<len;i++)
{
for(int j=1;j<=len-i;j++)
{
String p=s.substring(i,i+j);
char[] ch=p.toCharArray();
for(int l=0;l<ch.length;l++)
{
hs1.add(ch[l]);
}
if(p.length()==hs1.size())
{
hs.add(p);
al.add(p.length());
}
hs1.clear();
}
}
Collections.sort(al);
for(String q:hs)
{
if(q.length()==(int)al.get(al.size()-1))
{
System.out.println(q);
}
}
}
}
