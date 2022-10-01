package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numberToBePrinted = 0;
        while(numberToBePrinted<=multiplyByAndToInclusive)
        {
            System.out.println(numberToBePrinted * multiplyByAndToInclusive);
            numberToBePrinted++;
        }
    }
}
