package rohan;
import java.util.*;
class hello
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int br[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++)
         {
        	for(int j=0;j<ar.length;j++)
        	 {
        		if(ar[i]!=-1 && i!=j)
        		 {
        			if(ar[i]==ar[j])
        			 {
        				ar[i]=-1;
        			 }
        		 }
        	 }
         }
        int k=0;
        for(int i=0;i<ar.length;i++)
         {
        	if(ar[i]!=-1)
        	 {
        		br[k]=ar[i];
        		k++;
        	 }
         }
        for(int i=0;i<k;i++)
        {
        	System.out.println(br[i]);
        }
    }
