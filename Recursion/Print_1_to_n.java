package Practice.Recursion;

import java.util.Scanner;

public class Print_1_to_n {
    static void printIncresiong(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        if (n==0){
            return;
        }
        printIncresiong(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printIncresiong(n);

    }
}
