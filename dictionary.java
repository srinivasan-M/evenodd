import java.util.*;
class dictionary
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
Scanner ss=new Scanner(System.in);
System.out.print("Enter the words you want to store:");
int n=ss.nextInt();
System.out.print("Enter the words:");
String[] a=new String[n];
for(int i=0;i<n;i++)
{
a[i]=ss.next();
}
ss.nextLine();
Arrays.sort(a);
System.out.print("Enter the sentence");
String s=ss.nextLine();

for(String s1:s.split(" "))
{
int c=0;
for(String s2:a)
{
if(s1.equalsIgnoreCase(s2))
{
c++;
}
}
if(c==0)
{
al.add(s1);
}
for(String f:a)
{
for(String t:al)
{
int len=0;
char[] ch=t.toCharArray();
for(int i=0;i<ch.length;i++)
{
if(f.contains(String.valueOf(ch[i])))
{
len++;
}
}
if(len==ch.length)
{
System.out.println("The suggested word for \" "+t+"\" is\" "+f+"\" ");
}
}
}
}
}
}

