import java.util.*;
 class precee
 {
 public static void main(String args[])
 {
 Scanner ss=new Scanner(System.in);
 int n=ss.nextInt();
 int[] a=new int[n];
 int s=0,s1=0,s2=0,s3=0;
 for(int i=0;i<n;i++){
 a[i]=ss.nextInt();}
 if(n%2!=0){
 for(int i=0;i<n/2;i++){s=s+a[i];}
 for(int j=(n/2)+1;j<n;j++){s1=s1+a[j];}
 if(s==s1){System.out.print("The middle index is:"+((n/2)+1));}
 }
 if(n%2==0){
 for(int i=0;i<n/2;i++){s2=s2+a[i];}
 for(int j=(n/2)+1;j<n;j++){s3=s3+a[j];}
 if(s2==s3){System.out.print("The middle index is:"+((n/2)+1));}
 }
 }
 }
 
 
