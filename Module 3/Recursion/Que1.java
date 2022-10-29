/*
Q1.
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer. Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
------------------------------
*/

import java.util.Scanner;
class Que1{
	
	static double pow(int n,int k){
		if(n<=1)		return 1;// corner case
		if(k<=1)	return n*1.0;
		
		return n*pow(n,--k);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n & k  to find power k");
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(pow(n,k));
	}
}