import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();


        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Output: Palindrome");
        } else {
            System.out.println("Output: Not a palindrome");
        }
    }
}
