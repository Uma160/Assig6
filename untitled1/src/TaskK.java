import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {

                String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
                result.append(cap);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println("Output: " + result.toString());
    }
}
