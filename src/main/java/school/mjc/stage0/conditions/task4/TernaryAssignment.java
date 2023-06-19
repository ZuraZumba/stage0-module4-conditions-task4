package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = first > second ? 10 : -10;
        System.out.println(result);
    }
    public static void main (String [] args){
        TernaryAssignment assignment = new TernaryAssignment();
        int first = 1;
        int second = 1;
        assignment.assignAndPrintBasedOnWhichBigger(first, second);
    }
}
