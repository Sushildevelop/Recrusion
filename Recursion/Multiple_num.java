package Practice.Recursion;

import java.util.Scanner;

public class Multiple_num {
    static void go(int n,int k , int i){
        if(k == 0)return;
        System.out.print((n*i) + " ");
        go(n , k - 1 , i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        go(n,k,1);
    }
}
