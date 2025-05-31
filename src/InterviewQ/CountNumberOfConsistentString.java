package InterviewQ;

public class CountNumberOfConsistentString {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }
    private static int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for(int i=0; i<words.length; i++){
            boolean condition = true;
            for(int j=0; j<words[i].length(); j++){
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    condition = false;
                    break;
                }
            }
            if(condition){
                counter++;
            }
        }
        return counter;
    }
}
