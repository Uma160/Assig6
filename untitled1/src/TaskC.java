import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        String str =u.nextLine();
        int s=0;
        for (int i=0; i< str.length();i++){
            if ("aeiouAEIOU".contains ("" + str.charAt(i)))  {
                s++;
            }

        }
        System.out.println(s);
    }
}