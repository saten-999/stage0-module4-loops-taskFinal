package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int i=1,s=1;
        while (i<=power) {
            s*=numberToPrint;
            i++;
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
