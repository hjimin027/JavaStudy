// https://school.programmers.co.kr/learn/courses/30/lessons/181934
// 문자열에 따라 두 수의 크기를 비교

// 문자열 비교는 ".equals()"를 사용해야 함!!

public class StringCondition {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if (ineq.equals(">")){
            if (n > m) answer=1;
            else if (eq.equals("=") && n==m) answer=1;
        } else {
            if (n < m) answer=1;
            else if (eq.equals("=") && n==m) answer=1;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        StringCondition test = new StringCondition();
        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;
        System.out.println(test.solution(ineq1, eq1, n1, m1));
        
        String ineq2 = ">";
        String eq2 = "!";
        int n2 = 41;
        int m2 = 78;
        System.out.println(test.solution(ineq2, eq2, n2, m2));
    }
}
