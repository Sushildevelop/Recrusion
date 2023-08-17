package Practice.Recursion;

import java.util.Scanner;

public class pwer_a_and_b {
    static int power(int a , int b){
        if (b==0){
            return 1;
        }
        int ans=a*power(a,b-1);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a,b));
    }
}
