import java.util.Scanner;

//将最内侧循环替换为2分查找，二分查找的核心：l= mid-1,r=mid
//进一步改进：枚举所i[c]+i[d]的和并排序
public class AdvancedDraw {
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
		  sort(testarray,k);
		  System.out.println(solution(testarray,sum,k));
	  }
	
	
	 public static boolean solution(int []i,int j,int length){
		  int a,b,c,d,gl;
		
		  for(a=0;a<length;a++){
			  for(b=0;b<length;b++){
				  for(c=0;c<length;c++){
					  gl= j-i[a]-i[b]-i[c];
					  if(binarysearch(i,gl,length)==true){
						  return true;
					  }
				  }
			  }
		  }
	  
	   return false;
	}
	 
	 public static void sort(int[]array,int n){
		 int i,j,temp;
		 for(i=0;i<n;i++){
			 for(j=i+1;j<n;j++){
				 if(array[i]>array[j]){
					 temp = array[i];
					 array[i]= array[j];
					 array[j]=temp;
				 }
			 }
		 }
	 }
	 
	 public static boolean binarysearch(int[]array,int goal,int n){
		 int l= 0;
		 int r = n;
         int i;
         boolean answer = false;
         while(l<r&&answer==false){
        	 i = (l+r)/2;
        	 if(array[i]==goal){
        		 answer = true;
        		 
        	 }
        	 if(array[i]<goal){
        		 l= i+1;
        	 }
        	 else{
        		 r=i;
        	 }
         }
         return answer;
	 }
	 
	  
}
