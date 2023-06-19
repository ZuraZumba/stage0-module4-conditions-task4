package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result = (first > second)? first : ((second > first)? second : second);
        System.out.println(result);
        }
    public static void main (String [] args){
        TernaryGreatestNumberPrinter greatestNumberPrinter = new TernaryGreatestNumberPrinter();
        int first = 1;
        int second = 1;
        greatestNumberPrinter.printGreatest(first, second);
    }
}
