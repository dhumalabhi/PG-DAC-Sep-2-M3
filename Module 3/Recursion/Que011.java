/*
Q11. 

Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 

Sample Input 1 :
xaxb
Sample Output 1:
ab

Sample Input 2 :
abc
Sample Output 2:
abc

Sample Input 3 :
xx
Sample Output 3:

----------------------------------------------------
*/
import java.util.Scanner;

class Que011{
	static String removex(String str,int count,String ans){
		if(count==str.length())		return ans;
		if(str.charAt(count)=='x')	return removex(str,++count,ans);
		return removex(str,count+1,ans+=str.charAt(count));
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		
		System.out.println(removex(str,0,ans));
	}
}