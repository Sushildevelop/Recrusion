package Practice.Recursion;

import java.util.Scanner;

public class Fibonacci_Number {
    static int fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int series1=fib(n-1);
        int series2=fib(n-2);
        int ans=series1+series2;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
