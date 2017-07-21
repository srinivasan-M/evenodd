import java.util.*;
import java.lang.*;
class hun100
{
public static void main(String args[])
{
String s=args[0];int sum=0;
for(int i=0;i<s.length();i++)
{
if(i!=s.length()-1)
{
sum+=(Math.pow(Character.getNumericValue(s.charAt(i)),Character.getNumericValue(s.charAt(i+1))));
}
else if(i==s.length()-1)
{
sum+=1;
break;
}
}
System.out.print(sum+1);
}
}
