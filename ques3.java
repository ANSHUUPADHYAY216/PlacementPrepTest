package Test5;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name= sc.next().toUpperCase();
		sc.close();
		boolean ispali=true;
		int start=0;
		int end=name.length()-1;
		while(start<end)
		{
			if(name.charAt(start)!=name.charAt(end))
			{
				ispali=false;
				break;
			}
			start++;
			end--;
		}
		if(ispali)
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}

}
