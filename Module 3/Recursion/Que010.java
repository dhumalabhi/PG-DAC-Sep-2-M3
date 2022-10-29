/*
Q10.
Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba
Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/

import java.util.Scanner;

class Que010{
	static String removeDuplicate(String str,String ans, int count,char ch){
		if(count==str.length())		return ans;
		if(ch==str.charAt(count)){
			
			return removeDuplicate(str,ans,count+1,str.charAt(count));
		}
		return removeDuplicate(str,ans+=str.charAt(count),count+1,str.charAt(count));
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(removeDuplicate(str,"",0,' '));
	}
}