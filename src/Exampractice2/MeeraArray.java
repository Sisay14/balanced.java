package practice2;

public class MeeraArray {
    public static void main(String[] args) {
        int[]a={3, 5, -2};
        int[]b={8, 3, 4};
        int[]c={8, 3, 16};
        int[]d={1, 3, 7};
        System.out.println(isMeera(a));
        System.out.println(isMeera(b));
        System.out.println(isMeera(c));
        System.out.println(isMeera(d));

    }
    static int isMeera(int[]a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {

                if (2*a[i] ==  a[j])
                    return 0;
            }
        }
        return 1;

    }
}
