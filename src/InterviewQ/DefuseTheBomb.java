package InterviewQ;

import java.util.Arrays;

public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int[] decryptedBomb = new int[code.length];
        int[] reversedCode = reverseArray(code, code.length);
        if(k==0){
            Arrays.fill(decryptedBomb,0);
            return decryptedBomb;
        }

        for(int i=0; i<code.length; i++){
            if(k>0) {
                int sum = calculateSum(code, k, i);
                decryptedBomb[i] = sum;
            }
            else if(k<0){

                int sum = calculateSum(reversedCode, -k, i);
                decryptedBomb[i] = sum;
            }
        }
        if(k<0){
            return reverseArray(decryptedBomb,code.length);
        }
        return decryptedBomb;
    }
    private static int[] reverseArray(int[] array, int n){
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = array[i];
            j = j - 1;
        }
        return b;
    }
    private static int calculateSum(int[]code, int k, int i){
        int n = code.length;
        int sum = 0, tempK = k, inc=i;
        while(tempK>0){
            if(inc + 1 == n){
                inc=-1;
            }
            sum += code[inc + 1];
            inc++;
            tempK--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(decrypt(new int[]{5, 7, 1, 4}, 0)));
        System.out.println(Arrays.toString(decrypt(new int[]{2, 4, 9, 3}, -2)));
    }
}
