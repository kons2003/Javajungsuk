package src.exercise;

public class ex4_9 {
    public static void main(String[] args) {
        // 숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 작성하라.
        String str = "12345";
        int sum = 0;

        for (int i=0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum="+sum);
    }
}
