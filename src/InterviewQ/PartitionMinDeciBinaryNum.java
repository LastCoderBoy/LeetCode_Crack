package InterviewQ;

public class PartitionMinDeciBinaryNum {
    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
        System.out.println(minPartitions("82734"));
        System.out.println(minPartitions("27346209830709182346"));
        System.out.println(minPartitions("200500000000550"));
    }

    private static int minPartitions(String n) {
        int maxDigit = 0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) - '0' > maxDigit){
                maxDigit = n.charAt(i) - '0';
            }
        }
        return maxDigit;
    }
}
