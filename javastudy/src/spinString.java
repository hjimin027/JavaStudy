import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181945#
// 문자열을 입력받아 90도 회전하여 출력하는 프로그램

public class spinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        
        for (char i : a.toCharArray()) {
            System.out.println(i);
        }
    }
}