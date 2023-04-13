//Search in rotated sorted array.
//A rotated and sorted array is given and an integer is given. Task is to find index of that integer in O(log n) TC.
import java.util.Scanner;
public class Pivot {

    int pivot_index(int []ar){
        int s=0,e=ar.length-1,mid=0;
        mid=s+(e-s)/2;

        while(s<e){
            if(ar[mid]>= ar[0])
                s=mid+1;
            else
                e=mid;
            mid=s+(e-s)/2;
        }
        return s;
    }
    int search(int[]ar,int piv, int element){
        if(ar[piv]<=element && element<=ar[ar.length-1]){
            int s=piv, e=ar.length,mid;
            mid=s+(e-s)/2;
            while(s<e){
                if(ar[mid]==element)
                    return mid;
                else if(ar[mid]>=s)
                    s=mid+1;
                else
                    e=mid;
                mid=s+(e-s)/2;
            }


            }
        else{
            int s=0, e=piv-1,mid;
            mid=s+(e-s)/2;
            while(s<e){
                if(ar[mid]==element)
                    return mid;
                else if(ar[mid]>=s)
                    s=mid+1;
                else
                    e=mid;
                mid=s+(e-s)/2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Pivot P=new Pivot();

        int size,key;
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);

        size=sc.nextInt();
        System.out.println("Enter array elements ");

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();

        int pi= P.pivot_index(arr);

        System.out.println("Pivot element is "+arr[pi]+" and at position "+pi);

        System.out.println("Enter element to search");
        key=sc.nextInt();

        int index=P.search(arr,pi,key);

        System.out.println("Element found at "+index);







    }

}
