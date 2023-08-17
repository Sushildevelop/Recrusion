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
    // Efficient Approach
    static int Power(int a , int b){
       if (b==0){
           return 1;
       }
       if (b%2==0){
           int result=Power(a,b/2);
           return result*result;
       }
       else {
           int result=Power(a,(b-1)/2);
           return a*result*result;
       }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
    //    System.out.println(power(a,b));
        System.out.println(Power(a,b));
    }
}
