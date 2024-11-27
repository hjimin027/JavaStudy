// https://school.programmers.co.kr/learn/courses/30/lessons/181941
// 문자들이 담겨있는 배열 arr이 주어질 때, arr의 원소들을 순서대로 이어붙인 문자열을 반환하라.

public class stringArr2string {
    public String solution(String[] arr){
        String answer = "";
        for(String i : arr){
            answer += i;
        }
        return answer;

        // return String.join("", arr);
    }

    public static void main(String[] args) {
        stringArr2string s = new stringArr2string();
        String[] arr = {"a", "b", "c"};
        System.out.println(s.solution(arr)); // "abc"
    }
}