package src.exercise;

public class ex4_4 {
    public static void main(String[] args) {
        // 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
        int sum = 0;
        int s = 1;
        int num = 0;

        for (int i=1; true; i++, s=-s) {
            num = s * i;
            sum += num;

            if (sum >= 100)
                break;
        }

        System.out.println("num"+num);
        System.out.println("sum="+sum);
    }
}
