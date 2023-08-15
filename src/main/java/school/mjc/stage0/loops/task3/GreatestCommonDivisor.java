package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int num = 1;
        int gcd = 1;
        while(num <= first && num <= second) {
            if(first%num == 0 && second%num == 0)
                gcd = num;
            num++;
        }
        if(first!=0)
            System.out.println(gcd);
        else
            System.out.println(second);
    }
}
