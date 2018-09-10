package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int a = 0;
        int b = 1;
        int c =a+b ;
        System.out.println("fibonacci numbers till 40 are : ");
        for (int i = 0; i <= 40; i++) {
            System.out.print( a +" ");
            a = b;
            b = c;
            c = a + b;
        }
    }


}
