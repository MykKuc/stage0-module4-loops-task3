package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        int remainingNumber = t;
        String concatenatedToTurnIntoAString = "" + t;
        for(int i = 1;i <= concatenatedToTurnIntoAString.length();i++){
            int lastDigit = remainingNumber% 10;
            remainingNumber = remainingNumber/10;
            sum = sum + lastDigit;
        }

        System.out.println(sum);

    }
}
