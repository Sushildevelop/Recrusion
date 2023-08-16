package Practice.Recursion;

import java.util.Scanner;

public class Print_n_to_1 {
    static void printDecreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }
}
