package Test5;
import java.util.Scanner;
public class Ques1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"Car", "Truck"};
        String para = sc.nextLine().toLowerCase();
        sc.close();
        for (String word : arr) {
            String lowerWord = word.toLowerCase();
            int count = 0;
            int index = 0;
            while ((index = para.indexOf(lowerWord, index)) != -1) {
                count++;
                index = index + lowerWord.length();
            }
            System.out.println(word + " occurred " + count + " time(s)");
        }
        
    }
}