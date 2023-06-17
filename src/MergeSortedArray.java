//Give two sorted array, merge them.

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 5, 6, 8, 9}, arr2[] = {9, 11, 16, 70, 77};
        //The error in the provided line of Java code is the incorrect syntax for initializing an array. In Java, you cannot specify the size of an array during initialization if you are also providing the elements directly. This is an error arr1[5]={2,5,6,7,3}
        int length1 = arr1.length, length2 = arr2.length;

        int size = length1 + length2, i = 0, j = 0, k = 0;
        int[] arr3 = new int[size];
        //int arr3[size];


        while (i < arr1.length && j < arr2.length) {

            arr3[k++] = Math.min(arr1[i], arr2[j]);
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        while (i < arr1.length)
            arr3[k++] = arr1[i++];

        while (j < arr2.length)
            arr3[k++] = arr2[j++];

        System.out.println("Arrays before merging ");
        for (i = 0; i < arr1.length; i++)

            System.out.print(arr1[i] + "  ");
        System.out.println("\n");

        for (j = 0; j < arr2.length; j++)
            System.out.print(arr2[j] + " ");
        System.out.println("\n");
        System.out.println("Array after merging");


        for (int a = 0; a < k; a++) {
            System.out.print(arr3[a] + "  ");
        }


    }

}
