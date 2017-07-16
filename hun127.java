import java.util.*;
class hun127
{
    public static void main(String args[])
    {
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();int p=0,sum=0;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j!=0)
                {p=1;}
                else{
                p=0;
                break;
                }
            }
            if(p==1)
            {
            String s1=String.valueOf(i);
            int l=s1.length();
            char c=s1.charAt(l-1);
            if(Character.getNumericValue(c)==3)
            {
            sum+=i;
            }
            }
        }
        System.out.print(sum);
    }
}
