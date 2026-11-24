import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();

        String result = input.replaceAll("[0-9]", "");

        System.out.println("Output: " + result);
    }
}
