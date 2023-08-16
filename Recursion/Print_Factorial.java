package Practice.Recursion;

import java.util.Scanner;

public class Print_Factorial {
    static int factorial(int n){
        if (n==1){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(factorial(n));
    }
}
