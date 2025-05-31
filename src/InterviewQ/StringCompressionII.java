package InterviewQ;

public class StringCompressionII {
    public static char[] compress(char[] chars) {
        StringBuffer result = new StringBuffer();
        int inc = 1;
        int indexToPlace = 0;
        for(int i=0; i<chars.length-1; i++){
            if(chars[i] == chars[i+1]){
                inc++;
            }else if((chars[i] != chars[i+1]) && (inc < 10)) {
                result.append(inc);
                indexToPlace++;
                chars[i] = result.charAt(0);
                inc = 1;
                result.deleteCharAt(0);
            }
        }

        return chars;
    }

    public static void main(String[] args) {
//        System.out.println("a2b2c3".length());
//        System.out.println("textBoy".length());
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c','d'}));
        System.out.println(compress(new char[]{'b','a','a','a','a','a','a','a','a','a','a','a','a'}));
        System.out.println(compress(new char[]{'a'}));
    }
}
