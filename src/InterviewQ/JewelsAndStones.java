package InterviewQ;

public class JewelsAndStones {
    public static void main(String[] args) {

    }
    private static int numJewelsInStones(String jewels, String stones) {
        char[] jewelTypes = jewels.toCharArray();
        char[] stonesYouHave = stones.toCharArray();


        int jewelsInStones = 0;
        for(int i=0; i<jewelTypes.length; i++){
            for(int j=0; j<stonesYouHave.length; j++){
                if(jewelTypes[i] == stonesYouHave[j]){
                    jewelsInStones++;
                }
            }
        }
        return jewelsInStones;
    }
}
