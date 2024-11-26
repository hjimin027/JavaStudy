import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181949
// 문자열을 입력받아 대문자는 소문자로, 소문자는 대문자로 변환하여 출력하는 프로그램


public class changeUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        
        // char b;
        // for (int i=0; i<a.length(); i++){
        //     b = a.charAt(i);
        //     if(Character.isUpperCase(b)){
        //         System.out.print(Character.toLowerCase(b));
        //     } else {
        //         System.out.print(Character.toUpperCase(b));
        //     }
        // }

        for (char i : a.toCharArray()) {
            if(Character.isUpperCase(i)){
                System.out.print(Character.toLowerCase(i));
            } else {
                System.out.print(Character.toUpperCase(i));
            }
        }
    }
}