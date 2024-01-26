import java.util.Scanner;

public class TargetElement {
    static void add(int a[], int b[]) 
    {

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++) 
                {
                if (a[i] + b[j] == 10) {
                    System.out.println(a[i] + "\t" + b[j]);
                }
            }
        }

    }

    public static void main(String[] args) 
    {
        int a[] = { 2, 6, 8 }, b[] = { 2, 4, 8 };
        add(a, b);

    }
}
