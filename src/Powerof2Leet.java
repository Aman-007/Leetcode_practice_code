public class Powerof2Leet {

    boolean check(int n) {
        int rem = 0, flag = 0;
        while (Math.abs(n) != 0) {
            if(n==1)
                return true;
            rem = n % 2;
            if (rem == 1) {
                flag = 1;
                break;
            }
            n = n / 2;
        }
        System.out.println(flag);
        if (flag == 1)
            return false;
        return true;


    }


    public static void main(String[] args) {


        Powerof2Leet P1 = new Powerof2Leet();
        boolean x = P1.check(1024);
        System.out.println(x);


    }
}
//Another approach is that, just check number of set bit. If number of set bit is 1 then, provided number will be power of 2.
// Solution on leetcode

/*
* class Solution {
    public boolean isPowerOfTwo(int n) {

        int rem = 0, flag = 0;
        if(n<1)
        return false;
        while (n != 0) {
            if(n==1)
                return true;
            rem = n % 2;
            if (rem == 1) {
                flag = 1;
                break;
            }
            n = n / 2;
        }
        System.out.println(flag);
        if (flag == 1)
            return false;
        return true;




    }
}
* */