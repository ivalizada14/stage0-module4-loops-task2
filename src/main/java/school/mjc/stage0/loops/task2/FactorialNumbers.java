package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1, n = 1;
        System.out.println(1);
        while(n<=printToInclusive)
        {
            factorial*=n;
            n++;
            System.out.println(factorial);
        }

    }
}
