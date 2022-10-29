/*
Q4.
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1). Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
3
--------------------------------
*/


import java.util.Scanner;

class Que4{
	static int recursion(int target,int count,int[] arr,int res){
		if(count==arr.length)		return res;

		if(arr[count]==target)		res=count;
		return recursion(target,++count,arr,res);
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
		System.out.println("Enter a elements in which to find in array");
		int target=sc.nextInt();
		System.out.println("Element is on :"+recursion(target,0,arr,-1));
	}
}