// https://school.programmers.co.kr/learn/courses/30/lessons/181943
/*
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class overlap_String {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());

        return answer;
    }

    public static void main(String[] args) {
        String my_1 = "He11oWor1d";
        String overwrite_1 = "lloWorl";
        int s_1 = 2;
        System.out.println(solution(my_1, overwrite_1, s_1)); // "HelloWorld"

        String my_2 = "Program29b8UYP";
        String overwrite_2 = "merS123";
        int s_2 = 7;
        System.out.println(solution(my_2, overwrite_2, s_2)); // "ProgrammerS123"
    }
}
