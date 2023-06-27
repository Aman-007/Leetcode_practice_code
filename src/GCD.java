//Euclid's algo: gcd(a,b)=(a-b,b)

import java.util.Scanner;
public class GCD {
    static int cal_gcd(int n, int no){
        while(n!=no){

            if(n>no)
                n=n-no;
            else
                no=no-n;
        }
        return n;

    }

    public static void main(String[] args) {
        System.out.println("Enter two number to get their GDC");
        int num,num1;
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        num1=sc.nextInt();

        int result=cal_gcd(num, num1);
        System.out.println("Result is "+result);
    }

}
