import java.sql.SQLOutput;

/* Find 1st and last occurrence of an element in sorted array.
TC=O(logn)

In this question we are applying Bianry search algorithm to achive optimal time.
1st we are finding element, then we are comparing it with key. If
i. element is equal to key then,save index and in case of first occurrence we are moving end so that we can move towards left side, where is 1st occureence.
    In case if we are searching for last occurrence then, we have to move right side so that we can reach to last occurrence.
ii. If key is greater than arr[mid] then move start to mid+1, else move end to mid-1. In the last update mid.
iii. Everytime we are escaping the half elements of array, which gives O(log n) time complexity.

Another apporch was find element, in array then keep on going right and left side until, some other element doesn't occur.
This is brute froce approach, which gives TC O(n).
 */
import java.util.Scanner;
public class FirLasElement {
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
        FirLasElement FL1=new FirLasElement();
        System.out.println("Enter element to search ");
        int element;
        element=sc.nextInt();
        int fi= FL1.first(arr,element);
        int la= FL1.last(arr,element);

        System.out.println(fi+"  "+la);


    }
}
