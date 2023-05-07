package ZerihunJavaMethod;

public class lagestAdancentdifference {
    public static void main(String[] args) {
        int[]a={34,38,80,120,1,6,10,1000};
        System.out.println(largestAdjDifference(a));

    }
    static int largestAdjDifference(int[]a){
        int diff1=0,diff2=0;
        for (int i = 2; i <a.length-1 ; i+=2) {
            diff1=a[1]-a[0];
            diff2=a[i+1]-a[i];
            if (diff1>diff2)
                return diff1;

        }
        return diff2;
    }
}
