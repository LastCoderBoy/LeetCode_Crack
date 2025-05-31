package InterviewQ;

public class InsertGCDLinkedList {
    public static void main(String[] args) {
        System.out.println(GCD(12,6));
        System.out.println(GCD(10,3));
    }

    //Euclidean Algorithm for GCD
    private static int GCD(int a, int b){
        while(a != b && a!=0 && b!=0){
            if(a>b){
                a = a % b;
            }else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }
}
