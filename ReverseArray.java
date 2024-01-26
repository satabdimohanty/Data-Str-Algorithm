import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]=new int[5];
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the element of array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();

        }
        System.out.println("After Reverse");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }

    }
}
