//LC:204 Counting prime number by sieve of eratosthenes
import java.util.Scanner;
public class CountPrime {

    static int count(int num) {
        int[] arr = new int[num];


       int c=0, i, j;
       for(i=0;i<num;i++)
           arr[i]=0;

       for(i=2;i<num;i++){
           if(arr[i]==0){
               for(j=2*i;j<num;j=j+i){
                   arr[j]=1;
               }
           }
       }

       for(i=2;i<num;i++){
           if(arr[i]==0)
               c++;
       }
        return c;
    }


    public static void main(String[] args) {
        System.out.println("Enter number till where you want to find ");
        int number;
        Scanner ab=new Scanner(System.in);

        number=ab.nextInt();

        int result=count(number);
        System.out.println(result);


    }


}

