import java.util.Scanner;

public class TaskG {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();

        String result = input.replace(' ', '_');

        System.out.println("Output: " + result);
    }
}
