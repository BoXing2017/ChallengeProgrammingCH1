//共有n根棍子，选出周长尽可能长的三角形，如果不存在则输出No
//方法：暴力枚举
/*
 组合的枚举方式（n选3）
 
 for(i=0;i<b;i++)
		   for(j=i+1;j<b;j++)
			   for(l=j+1;l<b;l++)
				   
 
 
 */

import java.util.*;
public class ComposeTriangle {
   public static void main(String[]args){
	   int n;
	   Scanner scan = new Scanner(System.in);
	   n = scan.nextInt();
	   
	   int []length = new int[n];
	   for(int i=0;i<n;i++){
		   length[i] = scan.nextInt();
		   
	   }
	   System.out.println(solve(n,length));
	   
   }
   
   public static int solve(int b,int[]a){
	   int i,j,l,sum,maxlen,leftlen;
	   int ans =0;
	   for(i=0;i<b;i++){
		   for(j=i+1;j<b;j++){
			   for(l=j+1;l<b;l++){
				    sum = a[i]+a[j]+a[l];
				    maxlen = max(a[i],max(a[j],a[l]));
				    leftlen = sum-maxlen;
				    if(leftlen>maxlen){
				    	if(sum>ans){
				    		ans = sum;
				    	}
				    }
				   
			   }
		   }
	   }
	   return ans;
	   
   }
   
   public static int max(int a,int b){
	   if(a>b){
		   return a;
	   }
	   else return b;
   }
}
