import java.util.*;
class camel
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
String[] ch=s.split("\\s");
int c=0,c1=0;
for(String cr:ch){
if(Character.isUpperCase(cr.charAt(0))){
	c++;}
else
	c1++;
}
if(c==ch.length)
	System.out.println("The given string is a camel case:");
else
	System.out.println("The given string is not a camel case:");
}
}
