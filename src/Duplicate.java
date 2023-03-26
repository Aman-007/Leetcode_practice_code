//CodeStudio:An array of size N is given with 1 to N-1 elements. One element is repeting. Find that element.
//Ex: N=6 => array: 1,2,3,1,4,5 ans:1
import java.util.Scanner;
public class Duplicate {

    int dup(int ar[],int size){
        int result=0;
        for(int i=0;i<size;i++){
            result=result ^ ar[i];
        }
        for(int i=1;i<size;i++){
            result=result ^ i;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int n;
        Scanner sc= new Scanner(System.in);

        n=sc.nextInt();

        int arr[]=new int[n];
        //Taking input in array.
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.printf("Entered array is ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        // Passing array element to dup()

        Duplicate D=new Duplicate();
        int ans=D.dup(arr,n);
        System.out.println("Dupicate element is "+ans);




    }

}
