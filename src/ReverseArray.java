
//Reversing an array.
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        int size;
        System.out.println("Please enter size of array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int []arr = new int[size];
        int i,j,temp=0;

        System.out.println("Enter array");
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();

        System.out.println("Before reversal");
        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");

        i=0;
        j=size-1;
        while(i < j){
            temp=arr[j];
            arr[j--]=arr[i];
            arr[i++]=temp;
        }
        System.out.println(" ");

        System.out.print("After reversal");
        System.out.println("");
        for(i=0;i<size;i++)
            System.out.print(arr[i]+" ");


    }
}
