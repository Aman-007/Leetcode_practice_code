import java.util.*;
public class Add2Array {

    void add(int []ar1, int []ar2){
        int l1=ar1.length-1, l2=ar2.length-1;
        int sum=0, carry=0;
        Vector result=new Vector();

        while(l1>=0 && l2>=0){
            int val1=ar1[l1];
            int val2=ar2[l2];
            sum=val1+val2+carry;

            carry=sum/10;
            sum=sum%10;
            result.add(sum);
            l2--;l1--;
        }

        while(l1>=0){

            sum=ar1[l1--]+carry;
            carry=sum/10;
            sum=sum%10;

            result.add(sum);
        }

        while(l2>=0){

            sum=ar1[l2--]+carry;
            carry=sum/10;
            sum=sum%10;

            result.add(sum);
        }
        while(carry!=0){
            sum=carry;
            carry=sum/10;
            sum=sum%10;
            result.add(sum);
        }
        Collections.reverse(result);
        System.out.println(result);
    }

    public static void main(String[] args) {
        //int arr1[5],int arr2[4];
        int arr1[]=new int[3];
        int arr2[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array elements");
        for(int i=0;i<3;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter second array elements");
        for(int i=0;i<6;i++){
            arr2[i]= sc.nextInt();
        }
        Add2Array Aa=new Add2Array();
        Aa.add(arr1, arr2);


    }

}
