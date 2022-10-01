package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int numberToBePrinted = 0;
        while(numberToBePrinted<=lastPrinted)
        {
            System.out.println(numberToBePrinted);
            numberToBePrinted++;
        }
    }
}
