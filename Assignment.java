import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the count of Fibonacci numbers: ");
        int count = scanner.nextInt();
        printFibonacci(count);
        scanner.close();    
    }
    static void printFibonacci(int count) {
        int a = 1, b = 2;
        for (int i = 0; i < count; i++) {
            for(int j=0;j<a;j++){
                // a = i;
                System.out.print(a+" "); 
            }
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.println();
        }
        //System.out.println();
    }
}