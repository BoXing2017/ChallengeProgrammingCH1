import java.util.*;
/*��Ŀ����������nֻ�����ڳ���ΪL�ĸ��ϵ���˵ľ��룬��nֻ���ϵĳ���δ֪��ÿ��1cm���ٶ�����.��ֻ����ӭ������ʱ�͸��Ըı䷽��
 ���������ϵ����������ʱ����ʱ��
 ���ɣ���Ȼ�����������趨���������Ӳ�ͬ���ϵ����𣬰���������Է��ص����εȼ��ڽ�����е��趨,Ҳ�������������ϵ������˵���С������
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
