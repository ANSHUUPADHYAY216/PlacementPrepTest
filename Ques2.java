package Test5;

import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		String s= sc.next();
		sc.close();
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(s, index)) != -1) {
            count++;
            index = index + s.length();
        }
        System.out.println(s + " occurred " + count + " time(s)");
	}
}