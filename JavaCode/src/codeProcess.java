// https://school.programmers.co.kr/learn/courses/30/lessons/181932
// mode 값에 따라 달라짐

public class codeProcess {
    public String solution(String code){
        int mode = 0;
        int idx = 0;
        String ret = "";

        while(idx < code.length()){
            // if (code.charAt(idx) != '1') {
            //     if (mode==0){
            //         if (idx%2==0) ret += code.charAt(idx);
            //     } else {
            //         if (idx%2==1) ret += code.charAt(idx);
            //     }
            // } else mode ^= 1;
            // idx++;

            if (code.charAt(idx) == '1'){
                mode ^= 1;
                idx++;
                continue;
            }
            if (idx % 2 == mode)
                ret += code.charAt(idx);
            idx++;
        }
        // if (ret.isEmpty()) return "EMPTY";
        // return ret;
        return (ret.isEmpty()) ? "EMPTY" : ret;
    }

    public static void main(String[] args) {
        codeProcess cp = new codeProcess();
        String code = "abc1abc1abc";
        System.out.println(cp.solution(code));
    }
}