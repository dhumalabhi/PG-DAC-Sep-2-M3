/*
Q7.
Given an array of length N, you need to find and return the sum of all elements of the array. Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7  
--------------------------------
*/

import java.util.Scanner;

class Que7{
	static long sum(int[] arr,int count,long sum){
		if(count==arr.length)	return sum;
		return sum(arr,count+1,arr[count]+sum);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of elements in array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter a elements in array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of the all element in array is :"+sum(arr,0,0L));
		
	}
}