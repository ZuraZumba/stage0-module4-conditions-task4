package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        System.out.println((first>second) ? "first" : ((second > first) ? "second": "second"));
    }
    public static void main (String [] args){
        TernaryPrinter printer = new TernaryPrinter();
        int first = 1;
        int second = 1;
        printer.printWhichIsBigger(first, second);
    }
}
