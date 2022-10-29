/*
Q5.
Given is the code to print numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4
----------------------------------
*/
import java.util.Scanner;

class Que5{
	static void print(int n,int i){
		
		System.out.print(i+" ");
		if(n==i)	return;
		print(n,++i);
		
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n number to print");
		int n=sc.nextInt();
		print(n,1);
		
	}
}