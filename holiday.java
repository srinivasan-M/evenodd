import java.util.*;
class holiday
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
switch(s)
{
case "Mon":
          System.out.println("true");
		  break;
case "Tue":
          System.out.println("true");
		  break;
case "Wed":
          System.out.println("true");
		  break;
case "Thurs":
          System.out.println("true");
		  break;
case "Fri":
          System.out.println("true");
		  break;
case "Sat":
          System.out.println("false");
		  break;
case "Sun":
          System.out.println("false");
		  break;
default:
          System.out.print("Please enter the day correctly...!");
		  break;
}
}
}
