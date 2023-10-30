package school.mjc.stage0.loops.task2;

public class PrimeNumbers { 
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;

        while (number <= printToInclusive) {
            boolean isPrime = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                System.out.println(number);
            }
            number++;
        }
    }
}
