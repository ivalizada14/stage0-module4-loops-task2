package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numberToBePrinted = 0;
        if(multiplyByAndToInclusive == 0)
            return;
        while(numberToBePrinted<=Math.abs(multiplyByAndToInclusive))
        {
            System.out.println(numberToBePrinted * multiplyByAndToInclusive);
            numberToBePrinted++;
        }
    }
}
