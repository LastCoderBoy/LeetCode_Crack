package InterviewQ;

public class ClearDigits {
    public static String clearDigits(String s) {
        int ind = 0;
        int indexOfBuilder = -1;
        StringBuilder result = new StringBuilder();
        while(ind < s.length()){
            if(Character.isDigit(s.charAt(ind))){
                result.deleteCharAt(indexOfBuilder);
                indexOfBuilder--;
            }else{
                result.append(s.charAt(ind));
                indexOfBuilder++;
            }
            ind++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
        System.out.println(clearDigits("a4b4cd"));
    }
}
