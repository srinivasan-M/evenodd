
import java.util.*;
class keypad
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
int n=ss.nextInt();
ArrayList<String> hs=new ArrayList<String>();
hs.add("no alphabet");
hs.add("ABC");
hs.add("DEF");
hs.add("GHI");
hs.add("JKL");
hs.add("MNO");
hs.add("PQRS");
hs.add("TUV");
hs.add("WXYZ");
System.out.print(hs.get(n));
}
}
