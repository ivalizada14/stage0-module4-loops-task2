package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int numberToBePrinted = 0;
        while(numberToBePrinted<=printTillInclusive)
        {
            System.out.println(numberToBePrinted);
            numberToBePrinted+=2;
        }
    }
}
