package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        if (number < 0) {
            number = -number; // Consider the absolute value
        }

        int numCopy = number;
        int digitCount = 0;

        while (numCopy > 0) {
            numCopy /= 10;
            digitCount++;
        }

        numCopy = number;
        int sum = 0;

        for (int i = 0; i < digitCount; i++) {
            int digit = numCopy % 10;
            sum += digit;
            numCopy /= 10;
        }
        System.out.println(sum);
    }
}
