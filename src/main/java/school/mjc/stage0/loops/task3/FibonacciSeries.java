package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;
        for(int i = 0;i <= lastFibonacci-1;i++){

            System.out.println(num1 );

            int sumOfPreviousTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPreviousTwo;

        }
    }
}
