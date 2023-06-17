//Finding square root of given number upto given number of precision.
import java.util.Scanner;
public class SquareRoot {

    int sqroot(int num){
        int s=0,e=num,mid=(s+e)/2;
        int ans=-1,sq;

        while(s<e){
            sq=mid*mid;
            if(sq==num)
                return mid;
            else if(sq<num){
                ans=s;
                s=mid;
            }
            else
                e=mid-1;
            mid=(s+e)/2;

     


        }
        System.out.println("Square root is "+ans);

        return ans ;
    }

    public static void main(String[] args) {

        int number;
        System.out.println("Please enter number of which you want to find square root");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        SquareRoot S= new SquareRoot();
        int whole=S.sqroot(number);
        System.out.println(whole);


    }
}
