package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int prime = 2;
        while(prime<=printToInclusive)
        {
            int primeChecker = 2;
            boolean isPrime = true;
            while(primeChecker<=prime/2)
            {
                if(prime%primeChecker==0)
                    isPrime = false;
                primeChecker++;
            }
            if(isPrime)
                System.out.println(prime);
            prime++;
        }
    }
}
