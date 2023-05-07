package practice2;

public class BunkerArray2 {
    //A Bunker array is an array that contains the value 1 if and only if it contains a prime number.
    public static void main(String[] args) {

    }


    static int isBunkerArray(int[]a){
        int j;
        for (int i = 0; i <a.length ; i++) {
       //     if (a[i]==1&& isPrime(a[j]) && a[j]!=1)
                return 1;



        }
        return 0;
    }
    static boolean isPrime(int []a){
        for (int j = 0; j <a.length ; j++) {
            if (a[j]%j==0)
                return false;

        }
        return true;
    }
}
