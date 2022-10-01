package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1, n = 1;
        while(printToInclusive >= factorial * n)
        {
            factorial *= n;
            System.out.println(factorial);
            n++;
        }
    }
}
