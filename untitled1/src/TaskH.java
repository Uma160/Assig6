import java.util.Scanner;
public class TaskH {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input =in.nextLine();

        // Создаём StringBuilder, переворачиваем и возвращаем обратно в String
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Output: " + reversed);
    }
}

