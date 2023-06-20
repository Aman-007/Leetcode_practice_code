//https://leetcode.com/problems/merge-sorted-array/
import java.util.Scanner;
public class LeetCodeMergedSorted {
    public static void main(String[] args) {
        System.out.println("Enter both array size");
        int s1, s2, i, p1, p2;

        Scanner sc = new Scanner(System.in);
        s1 = sc.nextInt();
        s2 = sc.nextInt();

        int[] ar = new int[s1];
        int[] arr = new int[s2];

        System.out.println("Enter first array and fill empty space with 0");
        for (i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Number of element entreKd other than 0");

        int element_in_ar = sc.nextInt();


        System.out.println("Enter second array");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After merging");

        int size;
        size = ar.length + arr.length - 1;

        int[] narr = new int[size];

        p2 = arr.length - 1;
        p1 = element_in_ar - 1;

        i = s1 - 1;

        while (p2 > 0) {
            if (p1 > 0 && ar[p1] > arr[p2])
                ar[i--] = ar[p1--];
            else
                ar[i--] = arr[p2--];
        }
        for (i = 0; i < ar.length; i++)
            System.out.print(ar[i] + "  ");
    }

}

