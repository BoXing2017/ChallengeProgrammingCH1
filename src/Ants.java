import java.util.*;
/*题目描述：输入n只蚂蚁在长度为L的杆上到左端的距离，这n只蚂蚁的朝向未知以每秒1cm的速度爬行.两只蚂蚁迎面爬来时就各自改变方向
 求所有蚂蚁掉下来的最短时间和最长时间
 技巧：既然朝向能任意设定，不妨无视不同蚂蚁的区别，把相遇后各自返回的情形等价于交错而行的设定,也就是求所有蚂蚁到杆两端的最小最大距离
*/

public class Ants {
  public static void main(String[]args){
	  Scanner scan = new Scanner(System.in);
	  int n,i,L;
	  n = scan.nextInt();
	  L = scan.nextInt();
	  int[] position = new int[n];
	  for(i=0;i<n;i++){
		  position[i] = scan.nextInt();
	  }
	 solve(n,L,position);
  }
  
  public static void solve(int a,int c,int[]b){
	  int i,j,minT,maxT;
	  minT=0;
	  maxT=0;
	  for(i=0;i<a;i++){
		 minT = max(minT,min(b[i],c-b[i]));
		 maxT = max(maxT,max(b[i],c-b[i]));
	  }
	  System.out.println(maxT);
	  System.out.println(minT);
  }
  
  
  public static int max(int a,int b){
	   if(a>b){
		   return a;
	   }
	   else return b;
  }
  
  public static int min(int a,int b){
	   if(a<b){
		   return a;
	   }
	   else return b;
 }
}
