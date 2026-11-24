import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();


        String[] words = input.split(" ");

        String longestWord = "";


        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Output: " + longestWord);
    }
}
