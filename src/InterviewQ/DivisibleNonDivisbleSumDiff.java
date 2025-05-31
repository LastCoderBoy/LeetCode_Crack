package InterviewQ;

public class DivisibleNonDivisbleSumDiff {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10 ,3));
        System.out.println(differenceOfSums(5 ,1));
    }

    private static int differenceOfSums(int n, int m) {
        int num1 = 0;
        for(int i=1; i<=n; i++){
            if(i % m != 0){
                num1 += i;
            }
        }

        int num2 = 0;
        for(int i=1; i<=n; i++){
            if(i % m == 0){
                num2 += i;
            }
        }
        return num1 - num2;
    }
}
