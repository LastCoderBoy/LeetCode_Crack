package InterviewQ;

public class KthFactor {
    public static int kthFactor(int n, int k) {
        // [ 1, 2, 3, 4, 6, 12]
        int inc =0, kThFactor=-1;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                inc++;
                if(inc == k){
                    kThFactor = i;
                    break;
                }
            }
        }
        return kThFactor;
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(12,3));
        System.out.println(kthFactor(7,2));
        System.out.println(kthFactor(4,4));
    }
}
