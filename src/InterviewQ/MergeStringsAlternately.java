package InterviewQ;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuffer result = new StringBuffer();
        int bigLength = 0, smallLength =0;
        boolean condition = true;
        if(word1.length() > word2.length()){
            bigLength = word1.length();
            smallLength = word2.length();
        }else {
            bigLength = word2.length();
            smallLength = word1.length();
            condition = false;
        }
        for(int i = 0; i< bigLength; i++){
            if(i<smallLength) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            else if(condition){
                result.append(word1.charAt(i));
            }
            else if(!condition){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqrs"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
