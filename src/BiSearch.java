import java.sql.SQLOutput;

//Binary Search
//TC= O(log n)
import java.util.Scanner;
public class BiSearch {
    void BinarySearch(int arr[], int key){

        int start=0,end=0, mid=0;
        end=arr.length-1;
        mid=(start+end)/2;

        while(start <= end){

            if(key==arr[mid]){
                System.out.println("Element found at"+mid);
                break;
            }
            else if(key > mid){
                start=mid+1;
                mid=(start+end)/2;
            }
            else{
                end=mid-1;
                mid=(start+end)/2;
            }
        }

    }

    public static void main(String[] args) {
        BiSearch Obj1= new BiSearch();
        int n;
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to find");
        int value;
        value=sc.nextInt();
        Obj1.BinarySearch(arr,value);
    }
}
