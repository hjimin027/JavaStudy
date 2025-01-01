public class add_int2String {
    public int solution(int a, int b) {
            // 정수를 문자열로: +""
            int ab = Integer.parseInt(a+""+b);
            int ba = Integer.parseInt(b+""+a);
    
            // 두 숫자를 비교해서, 큰 것을 반환
            /* 방법1: Math.max() 사용
             * return Math.max(ab, ba);
             */
            /* 방법2: 삼항연산자( (조건)?true일때:false일때; ) */
            return (ab>ba) ? ab:ba;
            
    
            /*****************
            * 내 풀이
            * int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
            * int ba = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
            * 
            * if (ab>ba) return ab;
            * else return ba;
            ******************/
        }
    
    public static void main(String[] args) {
        add_int2String test = new add_int2String();
        int a1 = 9;
        int b1 = 91;
        System.out.println(test.solution(a1, b1));

        int a2 = 89;
        int b2 = 8;
        System.out.println(test.solution(a2, b2));
    }
}
