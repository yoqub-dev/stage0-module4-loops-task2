package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if (power < 0) {
            System.out.println("Too much power");
        } else {
            int exponent = 0;
            int result = 1;

            while (exponent <= power) {
                System.out.println("2^" + exponent + " = " + result);
                result *= 2;
                exponent++;
            }
        }
    }
}
