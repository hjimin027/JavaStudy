// https://school.programmers.co.kr/learn/courses/30/lessons/181940
// 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 반환 

public class repeat_String {
    public String solution(String my_string, int k){
        // String answer = "";
        // for(int i = 0; i < k; i++){
        //     answer += my_string;
        // }
        // return answer;

        return my_string.repeat(k);
    }
}
