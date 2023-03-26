/*CodeStudio:An array of size N is given with 1 to N-1 elements. One element is repeting. Find that element.
Ex: N=6 => array: 1,2,3,1,4,5 ans:1

Code Studio question to find duplicate items.

Approach 1: Sort all elements and comapare i and i+1 element. If i==i+1 then return ar[i].
Time complexity O(n2)

Approach 2: Use counting sort Again time complexity O(n2)

Approach 3: XOR

a ^ a = 0
a ^ 0 = a

Step1: in ans store XOR of all integers.
Step2: from 1 to N-1 again do XOR of ans and i

we have given array will be from 1 to N-1 so we are doing  XOR of all elements and a^a^a=a





*/


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
