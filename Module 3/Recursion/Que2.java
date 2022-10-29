/*
Q2.
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false. Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
--------------------------------
*/
import java.util.Scanner;

class Que2{
	static boolean isPresent(int target,int[] arr,int count){
		if(count< arr.length && arr[count]==target)		return true;
		if(count>=arr.length)							return false;
		return isPresent(target,arr,++count);
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
		System.out.println("Enter a number which want find in array");
		int target=sc.nextInt();
		System.out.println(isPresent(target,arr,0));
	}
}
// I am using recursion here for make this program interesting