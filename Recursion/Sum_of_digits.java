package Practice.Recursion;

import java.util.Scanner;

public class Sum_of_digits {
    static int sumOf(int n){
        if (n==1){
            return n;
        }
        int rem=n%10;
        int  ans=sumOf(n/10);
       return rem+ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sumOf(n));
    }
}
