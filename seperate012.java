import java.io.*;
import java.util.*;
import java.util.Scanner.*;
// Used Dutch National Flag Approach 
class solution{
	void fun(int[] A,int len){
		int low=0, mid=0, high=len-1, temp=0;
		while(mid<=high){
			switch(A[mid]){
				case 0:{
					temp=A[low];
					A[low]=A[mid];
					A[mid]=temp;
					mid++;
					low++;
					break;	
				}
				case 1:{
					mid++;
					break;
				}
				case 2:{
					temp=A[mid];
					A[mid]=A[high];
					A[high]=temp;
					high--;
					break;	
				}
			}

		}
		for(int i=0;i<len;i++){
			System.out.println(A[i]);
		}
	}
}

public class seperate012{	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int count0=0,count1=0,count2=0;
		int[] A = new int[100];
		for(int i=0;i<len;i++){
			A[i]=sc.nextInt();
		}
		solution sl = new solution();
		sl.fun(A,len);
	}
}