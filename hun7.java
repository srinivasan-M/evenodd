import java.util.*;
class hun7 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array values");
                String s="";
		for(int i=0;i<n;i++){	a[i]=in.nextInt();
		s=s.concat(String.valueOf(a[i]));}
		for(String s1:s.split("")){
		int l=s.length()-s.replaceAll(s1, "").length();
		if(l==1)	{
		System.out.println(s1);}
		}
	}

}
