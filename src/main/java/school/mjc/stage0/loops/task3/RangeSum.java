package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int theSum = 0;
        for(int i = firstBoarder; i <= secondBoarder; i++){
            theSum = theSum + i;
        }
        System.out.println(theSum);
    }
}
