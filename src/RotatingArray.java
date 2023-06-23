//Rorating an array using extra space and TC O(n)
import java.util.Scanner;
public class RotatingArray {
    public static void main(String[] args) {
        int size, i, temp;
        System.out.println("Enter size");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();

        int []ar=new int[size];
        int []arr=new int[size];

        System.out.println("Enter array elements");

        for( i=0; i<size;i++)
            ar[i]=sc.nextInt();

        System.out.println("Array before rotation ");

        for(i=0;i<size;i++){
            System.out.print(ar[i]+"  ");
        }


        temp=ar[size-1];

        for(i=0;i<size-1;i++)
            arr[i+1]=ar[i];
        arr[0]=temp;
// Solution can be optimized.
        ar=arr;
        System.out.println("\n");
        System.out.println("Array after rotation ");

        for(i=0;i<size;i++){
            System.out.print(ar[i]+"  ");
        }



    }
}
