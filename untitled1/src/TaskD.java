import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        String str =u.nextLine();
        int s=0;
        for (int i=0; i< str.length();i++){
            if (str.charAt(i) == ' '){
                s++;
            }

        }
        System.out.println(s+1);
    }
}