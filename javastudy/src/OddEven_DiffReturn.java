// https://school.programmers.co.kr/learn/courses/30/lessons/181935
// 양의 정수 n이 매개변수로 주어질 때, 
// n이 홀수라면 n 이하의 모든 홀수 합을 return
// n이 짝수라면 n 이하의 모든 짝수의 제곱의 합을 return

public class OddEven_DiffReturn {
    public int solution(int n) {
        int answer = 0;
        if (n%2 == 1){
            for (int i=0; i<=(n-1)/2; i++){
                answer += (i*2)+1;
            }
        } else {
            for (int i=0; i<=n/2; i++){
                answer += Math.pow(i*2, 2);
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        OddEven_DiffReturn test = new OddEven_DiffReturn();
        int num1 = 7;
        System.out.println(test.solution(num1));
        
        int num2 = 10;
        System.out.println(test.solution(num2));
    }
}
