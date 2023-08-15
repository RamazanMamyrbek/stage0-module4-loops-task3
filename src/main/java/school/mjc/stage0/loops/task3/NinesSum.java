package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
            return;
        }

        int lastNumber = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            lastNumber = lastNumber * 10 + 9;
        }

        long sum = 0;
        long term = 9;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += term;
            term = term * 10 + 9;
        }

        System.out.println(sum);
    }
}
