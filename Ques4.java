package Test5;

import java.util.Scanner;
//Accept a sentence from user and count total number of words. 
public class Ques4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		sc.close();
		int count=0;
		for(char ch:s.toCharArray())
		{
			count++;
		}
		System.out.println(count);
		int wordcount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' ||i==s.length()-1)
			{
				wordcount++;
			}
		}
		System.out.println(wordcount);
	}
}
