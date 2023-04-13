


/* Find total occurrence of an element in sorted array.
TC=O(logn)

Total occurrence= (last-first)+1;

Another appoarch was find element and keep on counting, that will give TC O(n)
 */
import java.util.Scanner;
public class Occurrence {
    //returning first occureence
    int first(int arr[],int key){
        int start=0,end=arr.length-1, mid=start+(end-start)/2;
        int ans=0;
        while(start<=end){

            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<key)
                start=mid+1;
            else
                end=mid-1;
            mid=start+(end-start)/2;

        }
        return ans;

    }
    int last(int arr[], int key){
        int start=0,end=arr.length-1, mid=start+(end-start)/2;
        int ans=0;
        while(start<=end){

            if(arr[mid]==key){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<key)
                start=mid+1;
            else
                end=mid-1;
            mid=start+(end-start)/2;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.printf("Enter arrya elements");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        Occurrence FL1=new Occurrence();
        System.out.println("Enter element to search ");
        int element;
        element=sc.nextInt();
        int fi= FL1.first(arr,element);
        int la= FL1.last(arr,element);

        System.out.println(fi+"  "+la);
        System.out.println("Total number of occurrence "+(la-fi+1));

    }
}

