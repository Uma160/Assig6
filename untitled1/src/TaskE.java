import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();
        int[] count = new int[256];


        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        char result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (count[input.charAt(i)] == 1) {
                result = input.charAt(i);
                break;
            }
        }

        if (result != 0) {
            System.out.println("Output: " + result);
        } else {
            System.out.println("Уникальных символов нет");
        }
    }
}