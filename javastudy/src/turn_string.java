import java.util.Scanner;

public class turn_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (char i : a.toCharArray()) {
            System.out.println(i);
        }
    }
}