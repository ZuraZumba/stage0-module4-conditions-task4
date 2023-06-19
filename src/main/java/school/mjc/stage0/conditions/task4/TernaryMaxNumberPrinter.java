package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = ((first > second && (first > third)) ? first : (second > first && second > third) ? second :
                (third > first && third > second) ? third : (first == second && first > third)? first : (second == third
                && second > first)? second : (first == third && first > second)? first : third);
        System.out.println(result);
    }
    public static void main (String [] args){
        TernaryMaxNumberPrinter maxNumberPrinter = new TernaryMaxNumberPrinter();
        int first = 1;
        int second = 0;
        int third = 1;
        maxNumberPrinter.printGreatest(first, second, third);
    }
}
