//��д������Դ�k��������ȡ�ĸ�(�����ԷŻ�)�Ƿ��п��ܺ�Ϊĳ������ֵsum
//����˼·
import java.util.*;

public class draw {
  public static void main(String[]args){
	  int k;
	  int sum;
	  int []testarray ;
	  Scanner scan = new Scanner(System.in);
	  k = scan.nextInt();
	  sum = scan.nextInt();
	  testarray = new int[k];
	  for(int i=0;i<k;i++){
		  testarray[i] = scan.nextInt();
	  }
	  System.out.println(solution(testarray,sum,k));
  }
  
  
  public static boolean solution(int []i,int j,int length){
	  int a,b,c,d;
	  for(a=0;a<length;a++){
		  for(b=0;b<length;b++){
			  for(c=0;c<length;c++){
				  for(d=0;d<length;d++){
					  if(i[a]+i[b]+i[c]+i[d]==j){
						  return true;
					  }
				  }
			  }
		  }
	  }
  
   return false;
}
  
  
}
