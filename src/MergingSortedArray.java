import java.util.Scanner;
public class MergingSortedArray {
    public static void main(String[] args) {
        int size,size1, len;
        System.out.println("Enter both array size ");
        Scanner sc= new Scanner(System.in);

        size=sc.nextInt();
        size1=sc.nextInt();

        int []ar=new int[size];
        int []ar1=new int[size1];

        int i,j,k=0;

        System.out.println("Enter first sorted array elements");
        for(i=0;i<size;i++)
            ar[i]=sc.nextInt();

        System.out.println("Enter second sorted array elements");
        for(i=0;i<size1;i++)
            ar1[i]=sc.nextInt();

        len=size+size1;

        i=j=0;

        int []arr=new int[len];

        while(i<size && j<size1){
            if(ar[i]<ar1[j])
                arr[k++]=ar[i++];
            else
                arr[k++]=ar1[j++];
        }
        while(i<size){
            arr[k++]=ar[i++];
        }

        while(j<size1){
            arr[k++]=ar1[j++];
        }
        System.out.println("After merging both arrays");
        for(i=0;i<k;i++)
            System.out.println(arr[i]+"  ");





    }
}
