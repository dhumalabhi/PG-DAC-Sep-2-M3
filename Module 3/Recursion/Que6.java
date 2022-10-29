/*Q6.
Given the code to find out and return the number of digits present in a number recursively. 
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
-----------------------------------
*/
import java.util.Scanner;

class Que6{
	static int noOfDigit(int count,int num){
		if(num<1)	return count;
		return noOfDigit(++count,num/10);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		//System.out.println((int)(Math.log10(num))+1);		//this is a nija technnique
		System.out.println(noOfDigit(0,num));
	}
}