package practice2;

public class MeeraNumber {
    public static void main(String[] args) {
        int n=21;
        System.out.println(isMeeraNumber(n));

    }
    static int isMeeraNumber(int n){
        int count=0;
        for (int i = 2; i <n ; i++) {
            if (n%i==0)
                count++;
            for (int j = 2; j <n ; j++) {
                if (n%j==0)

                    if (count==j)
                        return 1;
            }


        }
        return 0;
    }
}
