package InterviewQ;

public class RotateString {
    public static boolean rotateString(String s, String goal) {

//        if(s.equals(goal)) return true;
//        StringBuffer word = new StringBuffer();
//        word.append(s.substring(1));
//        for(int i=0; i<s.length(); i++){
//            char letter = s.charAt(i);
//            word.append(letter);
//            if(word.toString().equals(goal))return true;
//            else {
//                String temp = word.substring(1);
//                word.setLength(0);
//                word.append(temp);
//            }
//        }
//        return false;
        if(s.length()!=goal.length())
            return false;
        String str=s+s;
        if(str.contains(goal))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println( rotateString("abcde", "cdeab"));
        System.out.println( rotateString("abcde", "abced"));
    }
}
